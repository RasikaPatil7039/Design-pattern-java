package com.aurionpro.model;

public class SmsNotifier implements INotifier {

	private static SmsNotifier notifier;
	
	private SmsNotifier() {
		
	}
	public static SmsNotifier getInstance() {
		if(notifier==null) {
			notifier=new SmsNotifier();
		}
		return notifier;
	}

	@Override
	public String toString() {
		return "SmsNotifier";
	}

	@Override
	public void notifyUser(Account account, double amount, String transactionType) {
		System.out.println("amount : "+amount);
		System.out.println("transactiontype :"+transactionType);
		System.out.println(account);
		System.out.println("------------------------------");
		
	}


}
