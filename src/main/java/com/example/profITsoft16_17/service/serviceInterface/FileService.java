package com.example.profITsoft16_17.service.serviceInterface;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    void downloadParseAndSaveFile(MultipartFile jsonStringsFile);
}
