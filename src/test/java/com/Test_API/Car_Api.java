package com.Test_API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.model.Car;
import com.model.Cars_List;

public class Car_Api extends TestBase {
	@Test(priority = 1)
	public void printBlueCar() {
		Cars_List carList = response.as(Cars_List.class);
		System.out.println("Length of Car List>>  " + carList.getCars().length);
		for (Car car : carList.getCars()) {
			
			String actual = (car.getMetadata().getColor());
			System.out.println(actual);
			System.out.println(car.getMake() + " " + car.getModel());
			if (car.getMetadata().getColor().equalsIgnoreCase("Blue")) {
				System.out.println("Blue Car Name is >>>  (" + car.getMake() + ") and Note is->>>  "
						+ car.getMetadata().getNotes());
				System.out.println();
				System.out.println("Whole Elements of Blue Car is -> " + car.getMake() + " " + car);
				Assert.assertEquals(actual, "Blue");
			}
			
		}
	}

	@Test(priority = 2)
	public void lowestPriceOnly() {
		Cars_List carList = response.as(Cars_List.class);
		TreeMap<Float, String> tm = new TreeMap<Float, String>();// TreeMap will sort the value
		for (Car car : carList.getCars()) {
			tm.put(car.getPerdayrent().getPrice(), car.getMake());// putting car price as key and car name as value
		}
		System.out.println("Car Name with Lowest Price ->> " + tm.firstEntry().getValue());
		System.out.println("Lowest Price of All Cars ->> " + tm.firstKey());
	}

	@Test(priority = 3)
	public void lowestPriceAfterDiscount() {
		Cars_List carList = response.as(Cars_List.class);
		// List <Float> disList = new ArrayList<Float>();
		TreeMap<Float, String> tm = new TreeMap<Float, String>();
		for (Car car : carList.getCars()) {
			System.out.println(car.getPerdayrent().getDiscount());
			Float calculateDis = (car.getPerdayrent().getDiscount() / 100) * car.getPerdayrent().getPrice();
			Float afterdiscount = car.getPerdayrent().getPrice() - calculateDis;
			// disList.add(afterdiscount);
			tm.put(afterdiscount, car.getMake());
		}
		// Collections.sort(disList);
		// Float maxdiscount = disList.get(0);
		// System.out.println(maxdiscount);
		System.out.println("Car name After Discount->> " + tm.firstEntry().getValue() + " ,Price After discount->> "
				+ tm.firstKey());
	}

	@Test(priority = 4)
	public void highestRevenue() {
		Cars_List carList = response.as(Cars_List.class);
		TreeMap<Float, String> tm = new TreeMap<Float, String>();
		for (Car car : carList.getCars()) {
			Float totlExpences = car.getMetrics().getYoymaintenancecost() + car.getMetrics().getDepreciation();
			tm.put(totlExpences, car.getMake());
		}
		System.out.println(
				"Highest Expenses Of Car->> " + tm.lastKey() + ", And Car Name->> " + tm.lastEntry().getValue());

	}
}
