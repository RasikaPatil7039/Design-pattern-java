package com.aurionpro.test;

import com.aurionpro.model.Car;
import com.aurionpro.model.Produce;
import com.aurionpro.model.Vehicle;

public class BridgeTest {

	public static void main(String[] args) {
		Vehicle obj = new Car(new Produce());
		obj.manufacture();
	}

}
