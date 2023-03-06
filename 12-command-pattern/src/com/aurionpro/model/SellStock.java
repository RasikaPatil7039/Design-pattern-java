package com.aurionpro.model;

public class SellStock implements IOrder {

	private Stock stock;
	
	public SellStock(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sell();

	}

}
