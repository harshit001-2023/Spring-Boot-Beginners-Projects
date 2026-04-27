package com.studentscourse;

// Spring Core Constructor Injection — Task 3
// Task Name: Student-Course Example
// Objective:
//
//Illustrate constructor injection with multiple parameters and nested objects.
//
// Classes:
// Class 1 — Course
//
//Fields: courseId (int), courseName (String)
//
//Constructor: to set both fields.
//
//Method: showCourse() → prints course details.
//
// Class 2 — Student
//
//Fields: studentId (int), studentName (String), course (Course)
//
//Constructor: injects all dependencies.
//
//Method: displayStudentInfo() → prints student and course info.
//
// Configuration
//
//Use XML or annotation-based config.
//
//Inject Course into Student via constructor.
//
// Main Class — TestStudent
//
//Initialize Spring container.
//
//Retrieve Student bean.
//
//Call displayStudentInfo().
//
// Expected Output:
//Student ID: 201
//Student Name: Alice
//Course: Spring Framework

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    
    public static void main(String[] args) {
        
        // Load Spring configuration file from classpath
        @SuppressWarnings("resource")
		ApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Get Student bean
        Student student = (Student) context.getBean("student");
        
        // Display information
        student.displayStudentInfo();
    }
}