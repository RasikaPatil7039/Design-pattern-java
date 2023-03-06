package com.aurionpro.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
		
	}

	@Override
	public String getName() {
		return "golden hat"+super.getName();
	}

	@Override
	public double getPrice() {
		return 200+super.getPrice();
	}

	@Override
	public String getDescription() {
		return "golden"+super.getDescription();
	}
}
