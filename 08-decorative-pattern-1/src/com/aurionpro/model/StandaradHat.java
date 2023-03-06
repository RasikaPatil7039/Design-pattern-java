package com.aurionpro.model;

public class StandaradHat implements IHat {

	@Override
	public String getName() {
		return "standarad hat";
	}

	@Override
	public double getPrice() {
		return 500;
	}

	@Override
	public String getDescription() {
		return "black";
	}

}
