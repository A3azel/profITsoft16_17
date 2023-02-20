package com.example.profITsoft16_17.controller;

import com.example.profITsoft16_17.dto.PepDTO;
import com.example.profITsoft16_17.service.serviceInterface.PepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(path = "/api/v1/pep", produces="application/json")
public class PepController {

    private final PepService pepService;

    @Autowired
    public PepController(PepService pepService) {
        this.pepService = pepService;
    }

    @PostMapping("/file")
    public void downloadFile(@RequestPart("file") MultipartFile jsonStringsFile){

    }

    @GetMapping("/popular/name")
    public ResponseEntity<String> getPublicFigure(){
        System.out.println(pepService.getMostPopularName());
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/fido")
    public ResponseEntity<PepDTO> getMostPopularNames(@RequestParam(value = "fullName") String fullName){
        PepDTO pepDTO = pepService.findPepByFullName(fullName);
        return ResponseEntity.ok(pepDTO);
    }
}
