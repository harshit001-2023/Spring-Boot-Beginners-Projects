package com.department;

//Spring Core Constructor Injection — Task 2
//🎯 Task Name: Employee Department Example
//🧱 Objective:
//
//Use constructor injection to inject one bean (Department) into another (Employee).
//
//📘 Classes:
//🔹 Class 1 — Department
//
//Fields: deptId (int), deptName (String)
//
//Constructor: initialize both fields.
//
//Method: getDepartmentDetails() → prints department info.
//
//🔹 Class 2 — Employee
//
//Fields: empId (int), empName (String), department (Department)
//
//Constructor: injects all three fields (including dependency).
//
//Method: showEmployeeInfo() → prints employee + department details.
//
//🔹 Configuration
//
//Define both beans.
//
//Use constructor injection for Employee.
//
//🔹 Main Class — TestEmployee
//
//Load Spring context.
//
//Get Employee bean.
//
//Display details.
//
//✅ Expected Output:
//Employee ID: 101
//Employee Name: John
//Department: IT

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Employee employee = (Employee) context.getBean("employee");
        
        employee.showEmployeeInfo();
    }
}
