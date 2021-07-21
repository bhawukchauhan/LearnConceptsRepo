package com.BuchalkaTim;

import org.testng.annotations.Test;

import ListImplementationAbstract.ObjectTypeCheck;

public class ObjectTypeTest {
  @Test
  public void f() {
	  ObjectTypeCheck var = new ObjectTypeCheck(10.5);
	  double firstVar = (double) var.getValue();
	  System.out.println(var.getValue());
	  var = new ObjectTypeCheck(-1);
	  System.out.println(var.getValue());
	  var = new ObjectTypeCheck(2000.1273463);
	  double secondVar = (double) var.getValue();
	  System.out.println(var.getValue());
	  System.out.println("sum : " + (firstVar + secondVar));
	  var = new ObjectTypeCheck("object can store String");
	  System.out.println(var.getValue());
	  var = new ObjectTypeCheck(true);
	  System.out.println(var.getValue());
  }
}
