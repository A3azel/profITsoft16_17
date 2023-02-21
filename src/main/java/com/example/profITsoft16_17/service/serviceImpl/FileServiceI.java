package com.example.profITsoft16_17.service.serviceImpl;

import com.example.profITsoft16_17.entity.Pep;
import com.example.profITsoft16_17.repository.PepRepository;
import com.example.profITsoft16_17.service.serviceInterface.FileService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
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
    private static final String JSON_REGEX = "\\{\\s*[\\s\\S]+?}";
    private static final int CUSTOM_JSON_BUFFER = 50;

    private final MongoTemplate mongoTemplate;
    private final PepRepository pepRepository;

    @Autowired
    public FileServiceI(MongoTemplate mongoTemplate, PepRepository pepRepository) {
        this.mongoTemplate = mongoTemplate;
        this.pepRepository = pepRepository;
    }

    @Override
    public void downloadParseAndSaveFile(MultipartFile jsonStringsFile){
        downloadFile(jsonStringsFile);
        List<Pep> pepList = parseJson("src/main/resources/fileStore/pep.json");
        saveData(pepList);
    }

    private void downloadFile(MultipartFile jsonStringsFile){
        byte[] buffer = new byte[BUFFER_SIZE];
        File uploadDir = new File(SAVE_DIRECTORY);

        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        /*File convFile = new File(jsonStringsFile.getOriginalFilename());
        try {
            convFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("D:\\profITsoft16_17\\pep.zip"))) {
            ZipEntry zipEntry = zis.getNextEntry();
            while (zipEntry != null) {
                String fileName = zipEntry.getName();
                File newFile = new File(SAVE_DIRECTORY + File.separator + fileName);
                new File(newFile.getParent()).mkdirs();
                try (FileOutputStream fos = new FileOutputStream(newFile);){
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


    private List<Pep> parseJson(String dirPath){
        ObjectMapper mapper = new ObjectMapper();

        List<Pep> allPepJsons = new ArrayList<>();

        File jsonDirectory = new File(dirPath);
        /*System.out.println(jsonDirectory);
        File[] filesList = jsonDirectory.listFiles();
        if(filesList==null){
            System.out.println("Selected directory is empty");
            return allPepJsons;
        }*/

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(jsonDirectory))) {
                List<Pep> myObjects = mapper.readValue(bufferedReader, new TypeReference<List<Pep>>(){});
                System.out.println(myObjects.get(1));
                System.out.println(myObjects.size());
                return myObjects;
            } catch (IOException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }




        /*List<Pep> allViolations = new ArrayList<>();
        for(File jsonFile: filesList) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(jsonFile))) {
                List<Pep> violationList = mapper.readValue(bufferedReader, new TypeReference<>() {});
                if (violationList != null) {
                    allViolations.addAll(violationList);
                    StringBuilder jsonString = new StringBuilder();
                    String jsonLine;
                    int jsonCount = 0;
                    while ((jsonLine = bufferedReader.readLine()) != null) {
                        jsonString.append(jsonLine).append("\n");
                        Pattern pattern = Pattern.compile(JSON_REGEX);
                        Matcher matcher = pattern.matcher(jsonString.toString());
                        if (matcher.find()) {
                            Pep violation = mapper.readValue(matcher.group(), Pep.class);
                            allViolations.add(violation);
                            jsonCount++;
                            if (jsonCount > CUSTOM_JSON_BUFFER) {
                                jsonCount = 0;
                                *//*allViolations.clear();
                                allViolations.addAll(statisticsList);*//*
                            }
                            jsonString.setLength(0);
                        }
                    }
                }
            } catch (IOException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        }*/

        return null;
    }


    private void saveData(List<Pep> pepList){
        /*Document document = Document.parse("");
        mongoTemplate.insert(document, "foo");*/
        pepRepository.deleteAll();
        pepRepository.saveAll(pepList);
    }

    private static File checkFile(String filePath){
        File jsonFile = new File(filePath);
        if (!jsonFile.exists() || !jsonFile.isFile()) {
            throw new IllegalArgumentException();
        }
        return jsonFile;
    }
}
