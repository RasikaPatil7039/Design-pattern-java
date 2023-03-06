package com.aurionpro.test;

import com.aurionpro.model.Broker;
import com.aurionpro.model.BuyStock;
import com.aurionpro.model.IOrder;
import com.aurionpro.model.SellStock;
import com.aurionpro.model.Stock;


public class ClientTest {

	public static void main(String[] args) {
		Stock obj=new Stock();
		
		BuyStock bs=new BuyStock(obj);
		SellStock ss=new SellStock(obj);
		
		Broker broker=new Broker();
		broker.addOrder(bs);
		broker.addOrder(ss);
		
		broker.placeOrder();
	}

}
