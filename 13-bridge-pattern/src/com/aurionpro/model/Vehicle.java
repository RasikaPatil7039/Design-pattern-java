package com.aurionpro.model;

abstract public class Vehicle {

	protected IWorkshop workShop1;

	public Vehicle(IWorkshop workShop1) {
		super();
		this.workShop1 = workShop1;
	}
	
	abstract public void manufacture();
}
