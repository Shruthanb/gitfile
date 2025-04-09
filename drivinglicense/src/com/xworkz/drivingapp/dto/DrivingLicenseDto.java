package com.xworkz.drivingapp.dto;
public class DrivingLicenseDto {
    private String applicantName;
    private String dob;
    private String address;
    private String vehicleCategory;
    private String idProof;

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }
    public String getApplicantName() {
        return applicantName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getDob() {
        return dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }
    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }
    public String getIdProof() {
        return idProof;
    }
}
