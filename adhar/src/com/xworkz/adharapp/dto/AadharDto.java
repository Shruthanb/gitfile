package com.xworkz.adharapp.dto;

public class AadharDto {
    private String fullName;
    private String birthYear;
    private String address;
    private String mobileNumber;
    private String otp;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }
    public String getBirthYear() {
        return birthYear;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
    public String getOtp() {
        return otp;
    }
}
