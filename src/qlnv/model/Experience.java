package qlnv.model;

import java.util.ArrayList;

public class Experience extends Employee{
    private int expInYear;
    private String proSkill;

    public Experience(){

    }

    public Experience(String fullName, String doB, String email, int empType, ArrayList<Certification> empCertificates, int expInYear, String proSkill) {
        super(fullName, doB, email, 1, empCertificates);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println("Expin Years: " + expInYear);
        System.out.println("Pro Skill: " + proSkill);
    }

}
