package com.aurionpro.test;

import com.aurionpro.model.IOfficeInternetAccess;
import com.aurionpro.model.Proxy;

public class ProxyClientTest {

	public static void main(String[] args) {
		IOfficeInternetAccess access=new Proxy("rasika", 3);
		access.grantInternetAccess();

	}

}
