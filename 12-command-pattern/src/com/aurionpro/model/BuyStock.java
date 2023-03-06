package com.aurionpro.model;

public class BuyStock implements IOrder {

	private Stock stock;
	
	public BuyStock(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buy();

	}

}
