package com.example.profITsoft16_17.service.serviceInterface;

import com.example.profITsoft16_17.dto.PepDTO;
import com.example.profITsoft16_17.dto.PopularNameResponse;

public interface PepService {
    PepDTO findPepByFullName(String fullName);
    PopularNameResponse getMostPopularName();
}
