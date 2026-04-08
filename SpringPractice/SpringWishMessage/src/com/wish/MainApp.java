package com.wish;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//You are tasked with developing a Spring Core application that generates a wish message based on the current time of day using setter-based dependency injection. The application should use LocalDateTime to determine whether to send a "Good Morning", "Good Afternoon", or "Good Evening" message.
//
//Requirements:
//WishMessageGenerator Class:
//Create a WishMessageGenerator class with the following attributes:
//LocalDateTime currentDateTime: This will store the current date and time.
//Implement a setter method for currentDateTime to allow for dependency injection using Spring.
//
//Implement a generateWishMessage() method that returns:
//"Good Morning" if the time is before 12 PM.
//"Good Afternoon" if the time is between 12 PM and 6 PM.
//"Good Evening" if the time is after 6 PM.
//
//Note:
//------
//Use Xml file to configure Spring bean.
//
//
//Main Class:
//Create a main class that loads the Spring application context, retrieves the WishMessageGenerator bean, and prints the wish message based on the current time.
//
//Expected Output:
//If the current time is before 12 PM:
//	Good Morning
//If the current time is between 12 PM and 6 PM:
//	Good Afternoon
//If the current time is after 6 PM:
//	Good Evening


public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");

        WishMessageGenerator generator = 
            (WishMessageGenerator) context.getBean("wishMessageGenerator");

        generator.generateWishMessage();
    }
}