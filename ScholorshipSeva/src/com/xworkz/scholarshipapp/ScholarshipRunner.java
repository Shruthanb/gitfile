package com.xworkz.scholarshipapp;

import com.xworkz.scholarshipapp.dto.ScholarshipDto;
import com.xworkz.scholarshipapp.service.ScholarshipSeva;

public class ScholarshipRunner {
    public static void main(String[] args) {
        ScholarshipDto dto = new ScholarshipDto();

        dto.setApplicantName("Anjali Kumari");
        dto.setInstituteName("National Science College");
        dto.setCourseName("B.Sc Physics");
        dto.setIncomeCertificate("INCOME2024CERT");
        dto.setBankAccountNumber("123456789012");

        ScholarshipSeva seva = new ScholarshipSeva();
        boolean result = seva.submitApplication(dto);

        if(result == true) {
            System.out.println("Eligible for Scholarship Processing");
        }
    }
}
