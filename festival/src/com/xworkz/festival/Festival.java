package com.xworkz.festival;

public class Festival {

    private int festivalId;

    private String name;

    private String country;

    private String month;

    private int durationInDays;

    private boolean isNationalHoliday;

    private String mainAttraction;

    public void setFestivalId(int festivalId) {
        this.festivalId = festivalId;
    }
    public int getFestivalId() {
        return festivalId;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    public String getMonth() {
        return month;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }
    public int getDurationInDays() {
        return durationInDays;
    }

    public void setIsNationalHoliday(boolean isNationalHoliday) {
        this.isNationalHoliday = isNationalHoliday;
    }
    public boolean getIsNationalHoliday() {
        return isNationalHoliday;
    }

    public void setMainAttraction(String mainAttraction) {
        this.mainAttraction = mainAttraction;
    }
    public String getMainAttraction() {
        return mainAttraction;
    }
}
