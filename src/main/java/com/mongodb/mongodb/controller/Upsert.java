package com.mongodb.mongodb.controller;

import com.mongodb.mongodb.model.CaseData;
import com.mongodb.mongodb.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cases")
public class Upsert {

    @Autowired
    private CaseService caseService;

    @PostMapping("/upsert")
    public CaseData upsertCase(@RequestBody CaseData caseData) {
        return caseService.upsertCase(caseData);
    }

}
