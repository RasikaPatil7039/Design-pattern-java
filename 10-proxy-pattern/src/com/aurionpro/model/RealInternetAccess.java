package com.aurionpro.model;

public class RealInternetAccess implements IOfficeInternetAccess {

	private String name;
	
	public RealInternetAccess(String name) {
		super();
		this.name = name;
	}

	@Override
	public void grantInternetAccess() {
		System.out.println("internet access granted: "+name);

	}

}
