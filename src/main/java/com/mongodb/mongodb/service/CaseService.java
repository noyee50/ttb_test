package com.mongodb.mongodb.service;

import com.mongodb.mongodb.model.CaseData;
import com.mongodb.mongodb.repository.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseService {
    @Autowired
    private CaseRepository caseRepository;

    public CaseData upsertCase(CaseData caseData) {
        return caseRepository.save(caseData); // Save acts as upsert
    }
}
