package com.addressinjection;

//# Question 1: Person and Address Injection:
//## You are tasked with developing a Spring Core application where a Person object has an Address object injected using
//setter-based dependency injection.
// 
//Requirements:
//## Address Class:
//##  
//Attributes:
//## .String city
//.String country
//.Setter methods for both fields.
// 
//Person Class:
//##  
//Attributes:
//## .String name
//.Address address
//.Setter methods for both fields.
//.A method displayInfo() that prints the person's name and address (city, country).
// 
//Note:
//## Use an XML file to:
//##  
//.Define both Person and Address beans.
//.Inject the Address bean into the Person bean via setter.
// 
//Main Class:
//Load Spring context, get Person bean, call displayInfo().
// 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        
        // Load Spring Context
        @SuppressWarnings("resource")
		ApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get Person bean
        Person person = (Person) context.getBean("person");

        // Display information
        person.displayInfo();
    }
}