package org.trishinfotech.facade.devices.livingroom;

import org.trishinfotech.facade.devices.TV;

public class LivingRoomTV extends TV {

	protected String source;

	public LivingRoomTV() {
		super("LivingRoomTV");
	}

	public void setSource(String source) {
		this.source = source;
		System.out.printf("Setting Source of '%s' to '%s'.\n", name, source);
	}

	public String source() {
		return source;
	}
}
