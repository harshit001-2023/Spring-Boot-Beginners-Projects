package com.dateprinter;

//Q1)
//You are tasked with developing a Spring Core application that prints the current date using setter-based dependency injection. The application will make use of LocalDate (a predefined class in Java) to demonstrate the setter injection of a LocalDate object.
//
//Requirements:
//DatePrinter Class:
//Create a DatePrinter class with the following attributes:
//LocalDate currentDate: This will store the current date.
//Implement a setter method setCurrentDate(LocalDate currentDate) to allow for dependency injection using Spring.
//Implement a printDate() method that prints the current date in the format YYYY-MM-DD.
//
//Note:
//------
//Use Xml file to configure Spring bean.
//
//Main Class:
//Create a main class that loads the Spring application context, retrieves the DatePrinter bean, and call printDate().

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DatePrinter datePrinter = (DatePrinter) applicationContext.getBean("datePrinter");
		
		datePrinter.printDate();

	}

}
