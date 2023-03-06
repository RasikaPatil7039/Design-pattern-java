package com.aurionpro.test;

import com.aurionpro.model.GoldenHat;
import com.aurionpro.model.IHat;
import com.aurionpro.model.PremiumHat;
import com.aurionpro.model.RibonedHat;
import com.aurionpro.model.StandaradHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		IHat obj = new PremiumHat();
		GoldenHat ghat = new GoldenHat(obj);
		RibonedHat rhat = new RibonedHat(ghat);
		System.out.println(rhat.getPrice());
		System.out.println(rhat.getName());

	}

}
