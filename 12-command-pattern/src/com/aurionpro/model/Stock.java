package com.aurionpro.model;

public class Stock {
	private String name = "cake";
	private int quantity = 10;
	
	public void buy() {
		System.out.println(name + quantity + "bought");
	}
	
	public void sell() {
		System.out.println(name + quantity + "sold");
	}
}
