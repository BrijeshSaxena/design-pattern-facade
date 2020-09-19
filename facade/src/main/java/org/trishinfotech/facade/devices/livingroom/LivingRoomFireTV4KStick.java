package org.trishinfotech.facade.devices.livingroom;

import org.trishinfotech.facade.devices.Appliance;
import org.trishinfotech.facade.devices.TV;

public class LivingRoomFireTV4KStick extends Appliance {

	protected TV tv;
	protected String appName;
	protected String contentName;

	public LivingRoomFireTV4KStick(TV tv) {
		super("LivingRoomFireTV4KStick");
		this.tv = tv;
	}

	// define operations for Fire TV Stick 4K
	public void openApp(String appName) {
		this.appName = appName;
		System.out.printf("Opening '%s' on '%s'.\n", appName, name);
	}

	public void selectContent(String contentName) {
		this.contentName = contentName;
		System.out.printf("Searching '%s' on '%s'.\n", contentName, appName);
	}

	public void play() {
		System.out.printf("Playing '%s' on '%s'.\n", contentName, appName);
	}

	public void closeApp() {
		System.out.printf("Closing '%s' on '%s'.\n", appName, name);
	}

	public TV tv() {
		return tv;
	}

	public String appName() {
		return appName;
	}

	public String contentName() {
		return contentName;
	}
}
