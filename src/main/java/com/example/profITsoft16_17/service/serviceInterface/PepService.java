package com.example.profITsoft16_17.service.serviceInterface;

import com.example.profITsoft16_17.dto.PepDTO;
import com.example.profITsoft16_17.dto.PopularNameResponse;

import java.util.List;

public interface PepService {
    PepDTO findPepByFullName(String fullName);
    List<PopularNameResponse> getMostPopularName();
}
