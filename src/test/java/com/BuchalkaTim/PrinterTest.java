package com.BuchalkaTim;

import org.testng.annotations.Test;

public class PrinterTest {
	@Test
	public void f() {
		/*
		Printer printer = new Printer(50, false);
		System.out.println(printer.addToner(50));
		System.out.println("initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "	+ printer.getPagesPrinted());
		pagesPrinted = printer.printPages(2);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "	+ printer.getPagesPrinted());
		
		Printer printer2 = new Printer(140, true);
		System.out.println(printer2.addToner(50));
		System.out.println("initial page count = " + printer2.getPagesPrinted());
		pagesPrinted = printer2.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "	+ printer2.getPagesPrinted());
		System.out.println(printer2.addToner(50));
		pagesPrinted = printer2.printPages(2);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "	+ printer2.getPagesPrinted());
		System.out.println(printer2.addToner(50));
		System.out.println(printer2.addToner(1));
		*/
		int randomNumber = (int) (Math.random());
		System.out.println("randomNumber : " + randomNumber);
		randomNumber = (int) (Math.random()*5);
		System.out.println("randomNumber : " + randomNumber);
		randomNumber = (int) (Math.random()*5) + 1;
		System.out.println("randomNumber : " + randomNumber);


	}
}
