package com.aurionpro.model;

public class MahindraFactory implements ICarFactory {

	private static MahindraFactory mahindraFactory;
	
	private MahindraFactory() {
		
	}
	
	public static MahindraFactory getInstance() {
		if(mahindraFactory==null) {
			mahindraFactory=new MahindraFactory();
		}
		return mahindraFactory;
	}
	
	
	@Override
	public ICars makeCar() {
		
		return new Mahindra();
	}

}
