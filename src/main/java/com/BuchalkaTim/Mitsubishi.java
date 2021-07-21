package com.BuchalkaTim;

public class Mitsubishi extends Car{

	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public void startEngine() {
		System.out.println("Car's engine is starting - " + this.getClass().getName().replace(this.getClass().getPackageName() + ".", ""));
	}

	@Override
	public void acclerate() {
		System.out.println("Car is acclerating - " + this.getClass().getName().replace(this.getClass().getPackageName() + ".", ""));
	}

	@Override
	public void braking() {
		System.out.println("Car is braking - " + this.getClass().getName().replace(this.getClass().getPackageName() + ".", ""));
	}

}
