package com.xworkz.defence;

public class Defence {
    private int defenceId;

    private String country;

    private int soldiers;

    private String branch;

    private double budget;

    private String headquarters;

    private boolean isNuclearPower;

    public void setDefenceId(int defenceId) {
        this.defenceId = defenceId;
    }
    public int getDefenceId() {
        return defenceId;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }

    public void setSoldiers(int soldiers) {
        this.soldiers = soldiers;
    }
    public int getSoldiers() {
        return soldiers;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getBranch() {
        return branch;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    public double getBudget() {
        return budget;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }
    public String getHeadquarters() {
        return headquarters;
    }

    public void setIsNuclearPower(boolean isNuclearPower) {
        this.isNuclearPower = isNuclearPower;
    }
    public boolean getIsNuclearPower() {
        return isNuclearPower;
    }
}
