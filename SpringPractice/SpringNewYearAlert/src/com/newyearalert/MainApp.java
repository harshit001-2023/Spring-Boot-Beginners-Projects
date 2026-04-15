package com.newyearalert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Changed from "newYearAlert" to "newyearalert" to match XML
        NewYearAlert newYearAlert = (NewYearAlert) context.getBean("newyearalert");
        
        newYearAlert.newYearAlert();
        
        // Close the context
        ((ClassPathXmlApplicationContext) context).close();
    }
}