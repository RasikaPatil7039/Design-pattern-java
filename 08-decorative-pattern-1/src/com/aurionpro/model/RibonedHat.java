package com.aurionpro.model;

public class RibonedHat extends HatDecorator {

	public RibonedHat(IHat hat) {
		super(hat);
	
	}

	@Override
	public String getName() {
		return "riboned hat"+super.getName();
	}

	@Override
	public double getPrice() {
		return 300+super.getPrice();
	}

	@Override
	public String getDescription() {
		return "blue"+super.getDescription();
	}
}
