package com.BuchalkaTim;

public class Car {
private boolean engine;
private int cylinders;
private String name;
private int wheels;

public Car(int cylinders, String name) {
	this.cylinders = cylinders;
	this.name = name;
	engine = true;
	wheels = 4;
}


public int getCylinders() {
	return cylinders;
}

public String getName() {
	return name;
}

public void startEngine() {
	System.out.println(getClass().getSimpleName() + " -> startEngine()");
}

public void acclerate() {
	System.out.println(this.getClass().getName().replace(this.getClass().getPackageName() + ".", "") + " -> acclerate()");
}

public void braking() {
	System.out.println(this.getClass().getName().replace(this.getClass().getPackageName() + ".", "") + " -> braking()");
}

}
