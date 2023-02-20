package com.example.profITsoft16_17.service.serviceImpl;

import com.example.profITsoft16_17.dto.PepDTO;
import com.example.profITsoft16_17.dto.PopularNameResponse;
import com.example.profITsoft16_17.entity.Pep;
import com.example.profITsoft16_17.exception.PepNotFoundException;
import com.example.profITsoft16_17.repository.PepRepository;
import com.example.profITsoft16_17.service.serviceInterface.PepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;

@Service
public class PepServiceI implements PepService {

    private final PepRepository pepRepository;
    private final MongoTemplate mongoTemplate;

    @Autowired
    public PepServiceI(PepRepository pepRepository, MongoTemplate mongoTemplate) {
        this.pepRepository = pepRepository;
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    @Transactional(readOnly = true)
    public PepDTO findPepByFullName(String fullName) {
        Pep selectedPep =  pepRepository.findByFullName(fullName)
                .orElseThrow(() -> new PepNotFoundException(String.format("Pep with full name: %s not found", fullName)));
        return PepDTO.createPepDTO(selectedPep);
    }

    @Override
    @Transactional(readOnly = true)
    public PopularNameResponse getMostPopularName() {
        GroupOperation nameCount = group("first_name")
                .count().as("nameCount");
        SortOperation sortNameCountASC = sort(Sort.by(Sort.Direction.DESC, "nameCount"));
        LimitOperation limitToFirstTenName = limit(1);
        ProjectionOperation projectToMatchModel = project()
                .andExpression("_id").as("popularName")
                .andExpression("nameCount").as("popularNameCount");
        Aggregation aggregation = newAggregation(nameCount, sortNameCountASC, limitToFirstTenName, projectToMatchModel);
        System.out.println("авыа");
        AggregationResults<PopularNameResponse> aggregationResults = mongoTemplate.aggregate(aggregation, "Test", PopularNameResponse.class);
        return aggregationResults.getUniqueMappedResult();
    }
}
