package com.department;

public class Department {
    
    private int deptId;
    private String deptName;
    
    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
    
    public String getDepartmentDetails() {
        return deptName;   // Return only department name as per expected output
    }
}