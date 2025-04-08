package com.xworkz.phonepeapp.dto;
public class PhonePeDto {
    private String fullName;
    private String mobileNumber;
    private String emailId;
    private String upiPin;
    private String confirmPin;
    private String bankName;
    private String referralCode;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getEmailId() {
        return emailId;
    }

    public void setUpiPin(String upiPin) {
        this.upiPin = upiPin;
    }
    public String getUpiPin() {
        return upiPin;
    }

    public void setConfirmPin(String confirmPin) {
        this.confirmPin = confirmPin;
    }
    public String getConfirmPin() {
        return confirmPin;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBankName() {
        return bankName;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }
    public String getReferralCode() {
        return referralCode;
    }
}
