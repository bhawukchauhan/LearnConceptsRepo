package com.BuchalkaTim;

import org.testng.annotations.Test;

public class CarTest {
  @Test
  public void f() {
		Car car =new Car(12,"Base car");
		car.acclerate();
		car.braking();
		System.out.println(car.getCylinders());
		car.startEngine();
		System.out.println(car.getName());
		
		Mitsubishi mitsubishi = new Mitsubishi(20, "Outlander");
		mitsubishi.acclerate();
		mitsubishi.braking();
		System.out.println(mitsubishi.getCylinders());
		mitsubishi.startEngine();
		System.out.println(mitsubishi.getName());
  }
}
