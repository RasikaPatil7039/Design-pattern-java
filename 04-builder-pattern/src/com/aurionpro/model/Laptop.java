package com.aurionpro.model;

public class Laptop {

	private String ram;
	private String hdd;
	private String keyborad;
	private String mouse;
	private boolean touchscreen;

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getKeyborad() {
		return keyborad;
	}

	public void setKeyborad(String keyborad) {
		this.keyborad = keyborad;
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	public boolean isTouchscreen() {
		return touchscreen;
	}

	public void setTouchscreen(boolean touchscreen) {
		this.touchscreen = touchscreen;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", keyborad=" + keyborad + ", mouse=" + mouse + ", touchscreen="
				+ touchscreen + "]";
	}

}
