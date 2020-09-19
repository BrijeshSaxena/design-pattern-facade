package org.trishinfotech.facade.devices;

public abstract class SoundBar extends Appliance {

	public static int TOP_VOLUME = 30;

	public static int LOWEST_VOLUME = 0;

	protected String soundMode;
	protected int currentVolume = 1;
	protected int volumeWhenMute;

	public SoundBar(String name) {
		super(name);
	}

	// define operations for SoundBar
	public void setSoundMode(String soundMode) {
		this.soundMode = soundMode;
		System.out.printf("Setting Sound-Mode of '%s' to '%s'.\n", name, soundMode);
	}

	public void increaseVolume() {
		if (currentVolume < TOP_VOLUME) {
			currentVolume++;
			System.out.printf("Encreasing volume of '%s' to '%d'.\n", name, currentVolume);
		} else {
			System.out.printf("'%s' is already on top volume!\n", name);
		}
	}

	public void decreaseVolume() {
		if (currentVolume > LOWEST_VOLUME) {
			currentVolume--;
			System.out.printf("Decreasing volume of '%s' to '%d'.\n", name, currentVolume);
		} else {
			System.out.printf("'%s' is already on mute!\n", name);
		}
	}

	public void volume(int volume) {
		if (volume >= LOWEST_VOLUME && volume <= TOP_VOLUME) {
			currentVolume = volume;
			System.out.printf("Setting volume of '%s' to '%d'.\n", name, currentVolume);
		} else {
			System.out.printf("Volume of '%s' is supports range between '%d' and '%d'!\n", name, LOWEST_VOLUME,
					TOP_VOLUME);
		}
	}

	public void mute() {
		if (currentVolume != LOWEST_VOLUME) {
			volumeWhenMute = currentVolume;
			currentVolume = 0;
			System.out.printf("Putting '%s' on mute!\n", name);
		} else {
			currentVolume = volumeWhenMute;
			System.out.printf("Unmuting '%s'. Setting volume back to '%d'!\n", name, currentVolume);
		}
	}

	public String soundMode() {
		return soundMode;
	}
}
