package com.xworkz.constitution;

public class Constitution {
    private int constitutionId;

    private String country;

    private int articles;

    private int amendments;

    private String adoptedDate;

    private String language;

    private boolean isFederal;

    public void setConstitutionId(int constitutionId) {
        this.constitutionId = constitutionId;
    }
    public int getConstitutionId() {
        return constitutionId;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }

    public void setArticles(int articles) {
        this.articles = articles;
    }
    public int getArticles() {
        return articles;
    }

    public void setAmendments(int amendments) {
        this.amendments = amendments;
    }
    public int getAmendments() {
        return amendments;
    }

    public void setAdoptedDate(String adoptedDate) {
        this.adoptedDate = adoptedDate;
    }
    public String getAdoptedDate() {
        return adoptedDate;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }

    public void setIsFederal(boolean isFederal) {
        this.isFederal = isFederal;
    }
    public boolean getIsFederal() {
        return isFederal;
    }
}
