package com.aurionpro.model;

public class EmailNotifier implements INotifier {

private static EmailNotifier notifier;
	
	private EmailNotifier() {
		
	}
	public static EmailNotifier getInstance() {//to take unique
		if(notifier==null) {
			notifier=new EmailNotifier();
		}
		return notifier;
	}


	@Override
	public String toString() {
		return "EmailNotifier []";
	}
	
	@Override
	public void notifyUser(Account account, double amount, String transactionType) {
	System.out.println("amount : "+amount);
	System.out.println("transactiontype : "+transactionType);
	System.out.println(account);
	System.out.println("----------------------");
		
	}

}
