package com.xworkz.celebrity;

public class Celebrity {
    private int celebrityId;

    private String name;

    private int age;

    private String profession;

    private String nationality;

    private double netWorth;

    private boolean isActive;

    public void setCelebrityId(int celebrityId) {
        this.celebrityId = celebrityId;
    }
    public int getCelebrityId() {
        return celebrityId;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    public String getProfession() {
        return profession;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getNationality() {
        return nationality;
    }

    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }
    public double getNetWorth() {
        return netWorth;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    public boolean getIsActive() {
        return isActive;
    }
}
