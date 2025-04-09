package com.xworkz.metroapp.dto;

public class MetroPassDto {
    private String passengerName;
    private String gender;
    private String dob;
    private String startStation;
    private String endStation;
    private String idProof;
    private String travelDuration;

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public String getPassengerName() {
        return passengerName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getDob() {
        return dob;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }
    public String getStartStation() {
        return startStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }
    public String getEndStation() {
        return endStation;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }
    public String getIdProof() {
        return idProof;
    }

    public void setTravelDuration(String travelDuration) {
        this.travelDuration = travelDuration;
    }
    public String getTravelDuration() {
        return travelDuration;
    }
}
