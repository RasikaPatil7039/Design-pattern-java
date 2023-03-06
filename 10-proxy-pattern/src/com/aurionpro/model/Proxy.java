package com.aurionpro.model;

public class Proxy implements IOfficeInternetAccess {

	private String name;
	private RealInternetAccess realIntAccess;
	private int role;
	
	  public Proxy(String name, int role) {
		super();
		this.name = name;
		this.role = role;
	}

	  
	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}



	@Override
	public void grantInternetAccess() {
		if (getRole() > 4) 
		{
            realIntAccess = new RealInternetAccess(name);  
            realIntAccess.grantInternetAccess();  
        }   
        else   
        {  
            System.out.println("No Internet access granted. Your job level is below 5");  
        }  

	}

}
