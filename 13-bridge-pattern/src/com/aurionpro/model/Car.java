package com.aurionpro.model;

public class Car extends Vehicle {

	public Car(IWorkshop workshop1) {
		super(workshop1);

	}

	@Override
	public void manufacture() {
		System.out.println("car");
		workShop1.work();
	}

}
