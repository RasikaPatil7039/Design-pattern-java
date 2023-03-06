package com.aurionpro.test;

import com.aurionpro.model.Biscuit;
import com.aurionpro.model.Hat;
import com.aurionpro.model.HatAdapter;
import com.aurionpro.model.ShoppingCart;

public class CartTest {

	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart();
		cart.addItemtoCart(new Biscuit("parle-g",10));
		System.out.println(cart.getCartPrice());
		
		Hat hat=new Hat("hat", "red hat", 100, 10);
		cart.addItemtoCart(new HatAdapter(hat));
		System.out.println(cart.getCartPrice());
		
		
		
	}

}
