package org.trishinfotech.facade.devices.kitchen;

import org.trishinfotech.facade.devices.Appliance;

public class Microwave extends Appliance {

	protected int temp;
	protected int time;
	protected boolean grillOn = false;

	public Microwave() {
		super("Microwave");
	}

	public void grillOn() {
		this.grillOn = true;
		System.out.printf("Turning on grill of '%s'.\n", name);
	}

	public void grillOff() {
		this.grillOn = false;
		System.out.printf("Turning off grill of '%s'.\n", name);
	}

	public void setOnPreHeat(int temp, int time) {
		this.temp = temp;
		this.time = time;
		System.out.printf("Setting '%s' on Pre-Heat, temprature '%d', time '%d' minutes.\n", name, temp, time);
	}

	public void bake(String pizzaName, int temp, int time) {
		this.temp = temp;
		this.time = time;
		System.out.printf("Baking '%s' in '%s' for temprature '%d', time '%d' minutes.\n", pizzaName, name, temp, time);
	}

	public int temp() {
		return temp;
	}

	public int time() {
		return time;
	}
}
