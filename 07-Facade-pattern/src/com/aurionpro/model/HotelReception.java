package com.aurionpro.model;

public class HotelReception {
	public void getIndianMenu() {
		IHotel indHotel =new IndianHotel();
		IMenu menu=indHotel.getMenu();
		menu.displayMenu();
	}
	
	public void getItalianMenu() {
		IHotel itHotel=new ItalianHotel();
		IMenu menu=new ItalianMenu();
		menu.displayMenu();
	}
	
	public void getChineseMenu() {
		
	}

}
