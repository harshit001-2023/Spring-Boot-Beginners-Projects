package com.onlineshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        
        OnlineStore store = (OnlineStore) context.getBean("onlineStore");
        
        store.generateInvoice();
    }
}