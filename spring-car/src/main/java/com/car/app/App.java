package com.car.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.car.component.CarPart;
import com.car.component.CarPartsInventory;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		CarPartsInventory cp = (CarPartsInventory) ctx.getBean("carParts1");
		
		CarPart c = new CarPart();
		c.setPartName("Music System");
		c.setCarModel("Ford");
		c.setPrice(5999);
		c.setQuantity(90);
		cp.addNewPart(c);

	}
}
