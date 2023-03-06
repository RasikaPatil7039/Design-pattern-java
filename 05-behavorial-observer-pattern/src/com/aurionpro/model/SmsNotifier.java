package com.aurionpro.model;

public class SmsNotifier implements INotifier {

	

	@Override
	public String toString() {
		return "SmsNotifier";
	}

	@Override
	public void notifyUser(Account account, double amount, String transactionType) {
		System.out.println("amount : "+amount);
		System.out.println("transactiontype :"+transactionType);
		System.out.println(account);
			
		
	}


}
