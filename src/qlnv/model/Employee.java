package qlnv.model;

import java.util.ArrayList;

public abstract class Employee {
    private static int INDEX=0;
    protected int empCode;
    protected String fullName,doB,email;
    protected int empType;
    protected ArrayList<Certification> empCertificates = new ArrayList<>();

    public Employee() {
    }

    public Employee(String fullName, String doB, String email, int empType, ArrayList<Certification> empCertificates) {
        this.empCode = ++INDEX;
        this.fullName = fullName;
        this.doB = doB;
        this.email = email;
        this.empType = empType;
        this.empCertificates = empCertificates;;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmpType() {
        return empType;
    }

    public void setEmpType(int empType) {
        this.empType = empType;
    }

    public ArrayList<Certification> getEmpCertificates() {
        return empCertificates;
    }

    public void setEmpCertificates(ArrayList<Certification> empCertificates) {
        this.empCertificates = empCertificates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empCode=" + empCode +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", email='" + email + '\'' +
                ", empType=" + empType +
                ", empCertificates=" + empCertificates +
                '}';
    }

    public void showInfo(){};
}

