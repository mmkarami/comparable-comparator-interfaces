package com.mmkarami.vehicle;

import java.util.Comparator;

public class CarHpComparator implements Comparator<Car> {

	public int compare(Car car1, Car car2) {
		return Integer.compare(car1.getHp(), car2.getHp());
	}
}