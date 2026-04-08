package com.dateprinter;

import java.time.LocalDate;

public class DatePrinter {
	private LocalDate localDate;


	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	
	public void printDate() {
		if (localDate != null) {
            System.out.println("Current Date (YYYY-MM-DD): " + localDate);
        } else {
            System.out.println("Date is not set!");
        }
	}
	
	
}
