package com.aurionpro.model;

public class WhatsappNotifier implements INotifier {

	
	@Override
	public void notifyUser(Account account, double amount, String transactionType) {
		System.out.println("amount :"+amount);
		System.out.println("transactiontype :"+transactionType);
		System.out.println(account);
		
	}

}
