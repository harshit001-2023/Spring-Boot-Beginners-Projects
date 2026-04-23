package com.department;

public class Employee {
    
    private int empId;
    private String empName;
    private Department department;
    
    public Employee(int empId, String empName, Department department) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
    }
    
    public void showEmployeeInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department: " + department.getDepartmentDetails());
    }
}