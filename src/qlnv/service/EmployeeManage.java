package qlnv.service;

import qlnv.model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManage {
    private ArrayList<Employee> employees;
    private ArrayList<Experience> experience;
    private ArrayList<Fresher> fresher;
    private ArrayList<Intern> intern;
    private Scanner scanner;

    public EmployeeManage() {
        employees = new ArrayList<>();
        experience = new ArrayList<>();
        fresher = new ArrayList<>();
        intern = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addEmployee() {
        System.out.print("Nhập họ tên nhân viên: ");
        String fullName = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String doB = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();

        System.out.print("Nhập số lượng chứng chỉ: ");
        int sl = Integer.parseInt(scanner.nextLine());
        ArrayList<Certification> empCertificates = new ArrayList<>();
        for (int i = 0; i < sl; i++) {
            System.out.print("Nhập tên chứng chỉ: ");
            String certName = scanner.nextLine();
            System.out.print("Nhập rank: ");
            int rank;
            while (true) {
                rank = Integer.parseInt(scanner.nextLine());
                if (rank>= 8 && rank <= 10) {
                    break;
                } else {
                    System.out.print("Nhập lại rank (8-10): ");
                }
            }
        }

        System.out.print("Chọn phân loại nhân viên (1: Experience; 2: Fresher; 3: Intern): ");
        int empType = Integer.parseInt(scanner.nextLine());
        if (empType == 1) {
            System.out.print("Nhập số năm kinh nghiệm: ");
            int expInYear = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập kỹ năng chuyên môn: ");
            String proSkill = scanner.nextLine();

            Experience experience = new Experience(fullName, doB, email, empType, empCertificates, expInYear, proSkill);
            employees.add(experience);

        } else if (empType == 2) {
            System.out.print("Nhập thời gian tốt nghiệp: ");
            String graduationDate = scanner.nextLine();
            System.out.print("Nhập xếp loại tốt nghiệp: ");
            String graduationRank = scanner.nextLine();

            Fresher fresher = new Fresher(fullName, doB, email, empType, empCertificates, graduationDate, graduationRank);
            employees.add(fresher);

        } else if (empType == 3) {
            System.out.print("Nhập chuyên ngành đang học: ");
            String majors = scanner.nextLine();
            System.out.print("Nhập học kì đang học: ");
            int semester = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập tên trường đang học: ");
            String universityName = scanner.nextLine();

            Intern intern = new Intern(fullName, doB, email, empType, empCertificates, majors, semester, universityName);
            employees.add(intern);
        }

    }
    public void showEmployee(){
        for(Employee employee:employees){
            employee.showInfo();
        }
    }
}
