package com.example.profITsoft16_17.service.serviceImpl;

import com.example.profITsoft16_17.entity.Pep;
import com.example.profITsoft16_17.repository.PepRepository;
import com.example.profITsoft16_17.service.serviceInterface.FileService;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Service
public class FileServiceI implements FileService {
    private static final String SAVE_DIRECTORY = "src/main/resources/fileStore";
    private static final Integer BUFFER_SIZE = 1024;

    private final PepRepository pepRepository;

    @Autowired
    public FileServiceI(PepRepository pepRepository) {
        this.pepRepository = pepRepository;
    }

    @Override
    public void downloadParseAndSaveFile(MultipartFile jsonStringsFile) {
        pepRepository.deleteAll();
        downloadFile(jsonStringsFile);

        File jsonDirectory = new File(SAVE_DIRECTORY);
        File[] filesList = jsonDirectory.listFiles();
        if (filesList == null) {
            System.out.println("Selected directory is empty");
            return;
        }

        for (File jsonFile : filesList) {
            if (jsonFile.getName().endsWith("json")) {
                parseJson(jsonFile);
            }
        }
    }

    private void downloadFile(MultipartFile jsonStringsFile) {
        byte[] buffer = new byte[BUFFER_SIZE];
        File uploadDir = new File(SAVE_DIRECTORY);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }
        try (ZipInputStream zis = new ZipInputStream(jsonStringsFile.getInputStream())) {
            ZipEntry zipEntry = zis.getNextEntry();
            while (zipEntry != null) {
                String fileName = zipEntry.getName();
                File newFile = new File(SAVE_DIRECTORY + File.separator + fileName);
                new File(newFile.getParent()).mkdirs();
                try (FileOutputStream fos = new FileOutputStream(newFile);) {
                    int len;
                    while ((len = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, len);
                    }
                }
                zipEntry = zis.getNextEntry();
            }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    private void parseJson(File jsonFile) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Pep> pepList = new ArrayList<>();
        try {
            JsonParser jsonParser = objectMapper.createParser(jsonFile);
            jsonParser.nextToken();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY){
                Pep pep = objectMapper.readValue(jsonParser,Pep.class);
                pepList.add(pep);
                if(pepList.size()>=1000){
                    pepRepository.saveAll(pepList);
                    pepList.clear();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
