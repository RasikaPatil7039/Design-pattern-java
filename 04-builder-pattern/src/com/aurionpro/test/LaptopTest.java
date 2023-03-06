package com.aurionpro.test;

import com.aurionpro.model.Laptop;
import com.aurionpro.model.LaptopBuilder;

public class LaptopTest {

	public static void main(String[] args) {
		LaptopBuilder builder = new LaptopBuilder();
		builder.addHdd("wd").addKeyboard("microsoft").addMouse("dell").addRam("radeon").addTouchscreen(true);
		Laptop laptop = builder.build();
		System.out.println(laptop);

	}

}
