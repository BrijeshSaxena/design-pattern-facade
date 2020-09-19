package org.trishinfotech.facade.devices.livingroom;

import org.trishinfotech.facade.devices.Light;

public class LivingRoomLight extends Light {

	protected int brightness = 50;
	
	public LivingRoomLight() {
		super("LivingRoomLight");
	}

	public void dim() {
		brightness = 20;
		System.out.printf("Dimming '%s'.\n", name);
	}

	public void bright() {
		brightness = 100;
		System.out.printf("Setting brightness of '%s' to '%d'.\n", name, brightness);
	}

}
