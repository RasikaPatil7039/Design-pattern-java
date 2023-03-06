package com.aurionpro.model;  //invoker class

import java.util.ArrayList;
import java.util.List;

public class Broker {

	private List<IOrder>list=new ArrayList<IOrder>();
	
	public void addOrder(IOrder order) {
		list.add(order);
	}
	
	public void placeOrder() {
		for(IOrder order :list) {
			order.execute();
		}
		list.clear();
	}
	
}
