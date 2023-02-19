package com.example.profITsoft16_17.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(path = "/api/v1/pep", produces="application/json")
public class PepController {

    @PostMapping("/file")
    public void downloadFile(@RequestPart("file") MultipartFile jsonStringsFile){

    }

    @GetMapping("/popular/name")
    public ResponseEntity<String> getPublicFigure(){
        return ResponseEntity.ok("s");
    }

    @GetMapping("/popular/name")
    public ResponseEntity<String> getMostPopularNames(@RequestParam("fido") String fido){
        return ResponseEntity.ok("s");
    }
}
