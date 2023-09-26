package qlnv.model;

import java.util.ArrayList;

public class Intern extends Employee {
    private String majors;
    private int semester;
    private String universityName;

    public Intern(){

    }

    public Intern(String fullName, String doB, String email, int empType, ArrayList<Certification> empCertificates, String majors, int semester, String universityName) {
        super(fullName, doB, email,3, empCertificates);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", universityName='" + universityName + '\'' +
                '}';
    }
    @Override
    public void showInfo() {
        System.out.println("Majors: " +majors);
        System.out.println("Semester: " +semester);
        System.out.println("University Name: "+universityName);
        System.out.println("Certificates:");
    }
}
