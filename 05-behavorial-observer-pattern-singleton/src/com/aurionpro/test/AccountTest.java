package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.EmailNotifier;
import com.aurionpro.model.InsufficientBalanceException;
import com.aurionpro.model.SmsNotifier;

public class AccountTest {

	public static void main(String[] args) throws InsufficientBalanceException {
		Account obj = new Account(1, "rasika", 10000);
		obj.registerNotifier(SmsNotifier.getInstance());
		obj.registerNotifier(SmsNotifier.getInstance());
		
		obj.registerNotifier(EmailNotifier.getInstance());
		obj.withdraw(100);
		obj.deposit(50);
	}

}
