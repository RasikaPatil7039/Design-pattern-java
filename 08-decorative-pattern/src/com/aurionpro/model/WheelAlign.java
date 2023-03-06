package com.aurionpro.model;

public class WheelAlign extends CarServiceDecorator {

	public WheelAlign(ICarService obj) {
		super(obj);
	}
	
	@Override
	public double getCost() {
		return 400+super.getCost();
	}
}
