package com.studentscourse;

public class Student {
    
    private int studentId;
    private String studentName;
    private Course course;
    
    // Constructor Injection (injecting primitive values + dependency)
    public Student(int studentId, String studentName, Course course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }
    
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course.showCourse());
    }
}