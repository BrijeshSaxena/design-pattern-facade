package org.trishinfotech.facade.devices.livingroom;

import org.trishinfotech.facade.devices.SoundBar;
import org.trishinfotech.facade.devices.TV;

public class LivingRoomSoundBar extends SoundBar {

	protected TV tv;

	public LivingRoomSoundBar(TV tv) {
		super("LivingRoomSoundBar");
		this.tv = tv;
	}

	public TV tv() {
		return tv;
	}
	
}
