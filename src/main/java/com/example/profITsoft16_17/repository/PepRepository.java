package com.example.profITsoft16_17.repository;

import com.example.profITsoft16_17.entity.Pep;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PepRepository extends MongoRepository<Pep, String> {
}
