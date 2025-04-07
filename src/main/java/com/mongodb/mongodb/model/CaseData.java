package com.mongodb.mongodb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "cases")
public class CaseData {
    @Id
    private String caseNumber;

    private String createdOn;
    private String createdById;
    private String modifiedOn;
    private String modifiedById;
    private int statusCode;
    private String issueTh;
    private String issueEn;
    private String serviceCategoryCode;
    private String serviceCategoryValue;
    private String slaTargetDate;
    private String caseStatusCode;
    private String caseStatusValue;
    private String dataSourceCode;
    private String dataSourceValue;
    private String closedDate;
    private String ownerEmployeeId;
    private String ownerName;
    private String ownerTeamId;
    private String ownerTeamName;
    private String createdByEmployeeId;
    private String createdByName;
    private String createdByTeamId;
    private String createdByTeamName;
}
