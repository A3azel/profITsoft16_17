package com.example.profITsoft16_17.service.serviceImpl;

import com.example.profITsoft16_17.repository.PepRepository;
import com.example.profITsoft16_17.service.serviceInterface.PepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PepServiceI implements PepService {

    private final PepRepository pepRepository;

    @Autowired
    public PepServiceI(PepRepository pepRepository) {
        this.pepRepository = pepRepository;
    }


}
