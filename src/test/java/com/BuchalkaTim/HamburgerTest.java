package com.BuchalkaTim;

import java.util.Arrays;

import org.testng.annotations.Test;

public class HamburgerTest {
  @Test
  public void f() {
	  Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
	  hamburger.addHamburgerAddition1("Tomato", 0.27);
	  hamburger.addHamburgerAddition2("Lettuce", 0.75);
	  hamburger.addHamburgerAddition3("Cheese", 1.13);
	  System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

	  HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
	  healthyBurger.addHamburgerAddition1("Chicken", 5.43);
	  healthyBurger.addHealthyAddition1("Lentils", 3.41);
	  System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

	  DeluxeBurger db = new DeluxeBurger();
	  db.addHamburgerAddition3("Should not do this", 50.53);
	  System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
	  System.out.println("Total Deluxe Burger price is " + String.format("%.2f", db.itemizeHamburger()));
	  
	 int[] varInt = {20,10};
	 Hamburger[] arrHamburger = {new Hamburger("Basic", "Sausage", 3.56, "White"),
			 					new Hamburger("modified", "Sausage & bacon", 10.55, "Crispy")};
	 
	 for(Hamburger i :arrHamburger)
	 {
		  i.addHamburgerAddition1("Tomato", 0.27);
		  i.addHamburgerAddition2("Lettuce", 0.75);
		  i.addHamburgerAddition3("Cheese", 1.13);
		 System.out.println("Total Burger price is " + i.itemizeHamburger()); 
		 System.out.println("Total Burger price is " + String.format("%.2f", i.itemizeHamburger())); 
	 }
	  
  }
}
