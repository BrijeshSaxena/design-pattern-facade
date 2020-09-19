package org.trishinfotech.facade;

import java.util.List;

import org.trishinfotech.facade.devices.Fan;
import org.trishinfotech.facade.devices.Light;
import org.trishinfotech.facade.devices.SoundBar;
import org.trishinfotech.facade.devices.TV;
import org.trishinfotech.facade.devices.kitchen.CoffeeMaker;
import org.trishinfotech.facade.devices.kitchen.ElectricGrill;
import org.trishinfotech.facade.devices.kitchen.KitchenLight;
import org.trishinfotech.facade.devices.kitchen.Microwave;
import org.trishinfotech.facade.devices.kitchen.Refrigerator;
import org.trishinfotech.facade.devices.livingroom.LivingRoomFan;
import org.trishinfotech.facade.devices.livingroom.LivingRoomFireTV4KStick;
import org.trishinfotech.facade.devices.livingroom.LivingRoomLight;
import org.trishinfotech.facade.devices.livingroom.LivingRoomSoundBar;
import org.trishinfotech.facade.devices.livingroom.LivingRoomTV;

public class HomeFacade {

	Fan fan;
	LivingRoomFireTV4KStick stick;
	Light livingRoomLight;
	SoundBar soundBar;
	TV tv;

	CoffeeMaker maker;
	ElectricGrill grill;
	Light kitchenLight;
	Microwave microwave;
	Refrigerator refrigerator;

	public HomeFacade() {
		super();
		fan = new LivingRoomFan();
		tv = new LivingRoomTV();
		stick = new LivingRoomFireTV4KStick(tv);
		livingRoomLight = new LivingRoomLight();
		soundBar = new LivingRoomSoundBar(tv);

		maker = new CoffeeMaker();
		grill = new ElectricGrill();
		kitchenLight = new KitchenLight();
		microwave = new Microwave();
		refrigerator = new Refrigerator();
	}

	public void playMovieOnNetflix(String movieName) {
		fan.on();
		fan.increase();
		livingRoomLight.on();
		tv.on();
		((LivingRoomTV) tv).setSource("HDMI ARC");
		stick.on();
		soundBar.on();
		soundBar.setSoundMode("Dolby Atmos");
		stick.openApp("Netflix");
		stick.selectContent(movieName);
		((LivingRoomLight) livingRoomLight).dim();
		soundBar.volume(20);
		stick.play();
	}

	public void prepareFood(List<String> pizzaNames) {
		kitchenLight.on();
		// normally refrigerator runs always. so no need to turn on.
		refrigerator.partyMode(); // for fast cooling
		microwave.on();
		microwave.setOnPreHeat(200, 5);
		microwave.grillOn();
		grill.on();
		maker.on();
		pizzaNames.forEach(pizzaName -> microwave.bake(pizzaName, 400, 10));
	}

	public void stopMovie() {
		stick.closeApp();
		stick.off();
		soundBar.off();
		tv.off();
		((LivingRoomLight) livingRoomLight).bright();
		fan.off();
	}

	public void closeKitchen() {
		refrigerator.normalMode();
		grill.off();
		maker.off();
		microwave.off();
	}
}
