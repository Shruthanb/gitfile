package com.xworkz.simcard;

public class SimCard {

    private int simId;

    private String networkProvider;

    private String simType;

    private String mobileNumber;

    private boolean isActive;

    private String planType;

    private double balance;

    public void setSimId(int simId) {
        this.simId = simId;
    }
    public int getSimId() {
        return simId;
    }

    public void setNetworkProvider(String networkProvider) {
        this.networkProvider = networkProvider;
    }
    public String getNetworkProvider() {
        return networkProvider;
    }

    public void setSimType(String simType) {
        this.simType = simType;
    }
    public String getSimType() {
        return simType;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    public boolean getIsActive() {
        return isActive;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }
    public String getPlanType() {
        return planType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
