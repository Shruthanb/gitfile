package com.xworkz.scholarshipapp.service;

import com.xworkz.scholarshipapp.dto.ScholarshipDto;

public class ScholarshipSeva {
    public boolean submitApplication(ScholarshipDto dto) {
        boolean isSubmitted = false;
        boolean valid = verifyDetails(dto);

        if(valid == true) {
            isSubmitted = true;
            System.out.println("Scholarship Application Submitted Successfully");
        } else {
            System.out.println("Submission Failed. Check Input Details");
        }

        return isSubmitted;
    }

    public boolean verifyDetails(ScholarshipDto dto) {
        boolean isValid = false;

        boolean isName = false;
        boolean isInstitute = false;
        boolean isCourse = false;
        boolean isIncome = false;
        boolean isAccount = false;

        if(dto.getApplicantName() != null && !dto.getApplicantName().isEmpty()) {
            isName = true;
        } else System.out.println("Invalid Applicant Name");

        if(dto.getInstituteName() != null && !dto.getInstituteName().isEmpty()) {
            isInstitute = true;
        } else System.out.println("Invalid Institute Name");

        if(dto.getCourseName() != null && !dto.getCourseName().isEmpty()) {
            isCourse = true;
        } else System.out.println("Invalid Course Name");

        if(dto.getIncomeCertificate() != null && !dto.getIncomeCertificate().isEmpty()) {
            isIncome = true;
        } else System.out.println("Income Certificate Missing");

        if(dto.getBankAccountNumber() != null && !dto.getBankAccountNumber().isEmpty()) {
            isAccount = true;
        } else System.out.println("Invalid Bank Account Number");

        if(isName && isInstitute && isCourse && isIncome && isAccount) {
            isValid = true;
        }

        return isValid;
    }
}
