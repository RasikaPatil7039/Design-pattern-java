package com.aurionpro.model;

public class LaptopBuilder {
	private Laptop laptop;

	public LaptopBuilder() {
		this.laptop = new Laptop();
	}

	public LaptopBuilder addRam(String ram) {
		laptop.setRam(ram);
		return this;
	}

	public LaptopBuilder addHdd(String hdd) {
		laptop.setHdd(hdd);
		return this;
	}

	public LaptopBuilder addKeyboard(String keyboard) {
		laptop.setKeyborad(keyboard);
		return this;
	}

	public LaptopBuilder addMouse(String mouse) {
		laptop.setMouse(mouse);
		return this;
	}

	public LaptopBuilder addTouchscreen(Boolean touchscreen) {
		laptop.setTouchscreen(false);
		return this;
	}

	public Laptop build() {
		return laptop;
	}
}
