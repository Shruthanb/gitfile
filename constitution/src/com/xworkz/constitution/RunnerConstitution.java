package com.xworkz.constitution;

public class RunnerConstitution {

    public static void main(String[] args) {


        Constitution c1 = new Constitution();
        c1.setConstitutionId(1);
        c1.setCountry("India");
        c1.setArticles(448);
        c1.setAmendments(105);
        c1.setAdoptedDate("26 November 1949");
        c1.setLanguage("English and Hindi");
        c1.setIsFederal(true);

        System.out.println("Constitution 1 ID: " + c1.getConstitutionId());
        System.out.println("Country: " + c1.getCountry());
        System.out.println("Articles: " + c1.getArticles());
        System.out.println("Amendments: " + c1.getAmendments());
        System.out.println("Adopted Date: " + c1.getAdoptedDate());
        System.out.println("Language: " + c1.getLanguage());
        System.out.println("Is Federal: " + c1.getIsFederal());
        System.out.println("--------------------------------------------");

        Constitution c2 = new Constitution();
        c2.setConstitutionId(2);
        c2.setCountry("USA");
        c2.setArticles(7);
        c2.setAmendments(27);
        c2.setAdoptedDate("17 September 1787");
        c2.setLanguage("English");
        c2.setIsFederal(true);

        System.out.println("Constitution 2 ID: " + c2.getConstitutionId());
        System.out.println("Country: " + c2.getCountry());
        System.out.println("Articles: " + c2.getArticles());
        System.out.println("Amendments: " + c2.getAmendments());
        System.out.println("Adopted Date: " + c2.getAdoptedDate());
        System.out.println("Language: " + c2.getLanguage());
        System.out.println("Is Federal: " + c2.getIsFederal());
        System.out.println("--------------------------------------------");

        Constitution c3 = new Constitution();
        c3.setConstitutionId(3);
        c3.setCountry("Germany");
        c3.setArticles(146);
        c3.setAmendments(60);
        c3.setAdoptedDate("23 May 1949");
        c3.setLanguage("German");
        c3.setIsFederal(true);

        System.out.println("Constitution 3 ID: " + c3.getConstitutionId());
        System.out.println("Country: " + c3.getCountry());
        System.out.println("Articles: " + c3.getArticles());
        System.out.println("Amendments: " + c3.getAmendments());
        System.out.println("Adopted Date: " + c3.getAdoptedDate());
        System.out.println("Language: " + c3.getLanguage());
        System.out.println("Is Federal: " + c3.getIsFederal());
        System.out.println("--------------------------------------------");

        Constitution c4 = new Constitution();
        c4.setConstitutionId(4);
        c4.setCountry("France");
        c4.setArticles(89);
        c4.setAmendments(24);
        c4.setAdoptedDate("4 October 1958");
        c4.setLanguage("French");
        c4.setIsFederal(false);

        System.out.println("Constitution 4 ID: " + c4.getConstitutionId());
        System.out.println("Country: " + c4.getCountry());
        System.out.println("Articles: " + c4.getArticles());
        System.out.println("Amendments: " + c4.getAmendments());
        System.out.println("Adopted Date: " + c4.getAdoptedDate());
        System.out.println("Language: " + c4.getLanguage());
        System.out.println("Is Federal: " + c4.getIsFederal());
        System.out.println("--------------------------------------------");

        Constitution c5 = new Constitution();
        c5.setConstitutionId(5);
        c5.setCountry("Japan");
        c5.setArticles(103);
        c5.setAmendments(0);
        c5.setAdoptedDate("3 May 1947");
        c5.setLanguage("Japanese");
        c5.setIsFederal(false);

        System.out.println("Constitution 5 ID: " + c5.getConstitutionId());
        System.out.println("Country: " + c5.getCountry());
        System.out.println("Articles: " + c5.getArticles());
        System.out.println("Amendments: " + c5.getAmendments());
        System.out.println("Adopted Date: " + c5.getAdoptedDate());
        System.out.println("Language: " + c5.getLanguage());
        System.out.println("Is Federal: " + c5.getIsFederal());
    }
}