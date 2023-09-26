package qlnv.controller;

import qlnv.model.Employee;
import qlnv.service.EmployeeManage;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmployeeManage employeeManage = new EmployeeManage();
        employeeManage.addEmployee();
        }
}
