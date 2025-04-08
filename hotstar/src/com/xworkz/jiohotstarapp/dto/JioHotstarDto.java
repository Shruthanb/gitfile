package com.xworkz.jiohotstarapp.dto;

public class JioHotstarDto {
    private String fullName;
    private String mobileNumber;
    private String emailId;
    private String subscriptionPlan;
    private String deviceType;

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

    public void setSubscriptionPlan(String subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }
    public String getSubscriptionPlan() {
        return subscriptionPlan;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
    public String getDeviceType() {
        return deviceType;
    }
}
