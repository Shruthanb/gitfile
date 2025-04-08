package com.xworkz.fastagapp.dto;
public class FastagDto {
    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;
    private String mobileNo;
    private String kycDocument;

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public String getVehicleType() {
        return vehicleType;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getMobileNo() {
        return mobileNo;
    }

    public void setKycDocument(String kycDocument) {
        this.kycDocument = kycDocument;
    }
    public String getKycDocument() {
        return kycDocument;
    }
}
