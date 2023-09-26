package qlnv.model;

import java.util.ArrayList;

public class Fresher extends Employee{
    private String graduationDate, graduationRank;

    public Fresher(){

    }

    public Fresher(String fullName, String doB, String email, int empType, ArrayList<Certification> empCertificates, String graduationDate, String graduationRank) {
        super(fullName, doB, email, 2, empCertificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println("Graduation Date: " + graduationDate);
        System.out.println("Graduation Rank: " + graduationRank);
    }
}
