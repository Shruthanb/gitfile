package com.xworkz.scholarshipapp.dto;

public class ScholarshipDto {
    private String applicantName;
    private String instituteName;
    private String courseName;
    private String incomeCertificate;
    private String bankAccountNumber;

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }
    public String getApplicantName() {
        return applicantName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }
    public String getInstituteName() {
        return instituteName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setIncomeCertificate(String incomeCertificate) {
        this.incomeCertificate = incomeCertificate;
    }
    public String getIncomeCertificate() {
        return incomeCertificate;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }
}
