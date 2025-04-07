package com.mongodb.mongodb.repository;

import com.mongodb.mongodb.model.CaseData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CaseRepository extends MongoRepository<CaseData, String> {
    // You can add custom queries here if needed
}