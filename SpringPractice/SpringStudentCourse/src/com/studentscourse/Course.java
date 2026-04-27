package com.studentscourse;

public class Course {
    
    private int courseId;
    private String courseName;
    
    // Constructor for Constructor Injection
    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    
    public String showCourse() {
        return courseName;   // Returns only name to match expected output
    }
}