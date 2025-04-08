package com.xworkz.pancardapp.dto;

public class PanCardDto {
    private String applicantName;
    private String fatherName;
    private String dob;
    private String gender;
    private String aadhaarNumber;
    private String mobile;
    private String email;
    private String address;
    private String panType;

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }
    public String getApplicantName() {
        return applicantName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getFatherName() {
        return fatherName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getDob() {
        return dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }
    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getMobile() {
        return mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setPanType(String panType) {
        this.panType = panType;
    }
    public String getPanType() {
        return panType;
    }
}
