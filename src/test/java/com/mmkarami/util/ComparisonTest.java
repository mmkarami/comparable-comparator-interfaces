package com.mmkarami.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.mmkarami.vehicle.Car;
import com.mmkarami.vehicle.CarHpComparator;

public class ComparisonTest {

	@Test
	public void testFindingTheFastestCarByArray_whenRequestTheFastestCar_thenItMustReturnTheFastest() {
		// Arrange
		Car[] cars = { new Car("BMW Series 7", 290, 380), new Car("Ferarri", 350, 570),
				new Car("Land Rover", 210, 400) };

		// Act
		Car theFastest = (Car) Comparison.findTheBestByJavaArraysSort(cars);

		// Assert
		assertEquals("Ferarri", theFastest.getName());
	}

	@Test
	public void testFindingTheFastestCarByList_whenRequestTheFastestCar_thenItMustReturnTheFastest() {
		// Arrange
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("BMW Series 7", 290, 300));
		cars.add(new Car("Ferarri", 350, 570));
		cars.add(new Car("Land Rover", 210, 400));

		// Act
		Car theFastest = Comparison.findTheBestByJavaCollectionsSort(cars);

		// Assert
		assertEquals("Ferarri", theFastest.getName());
	}

	@Test
	public void testFindingTheFastestCarByMySearch_whenRequestTheFastestCar_thenItMustReturnTheFastest() {
		// Arrange
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("BMW Series 7", 290, 300));
		cars.add(new Car("Ferarri", 350, 570));
		cars.add(new Car("Land Rover", 210, 400));

		// Act
		Car theFastest = Comparison.findTheBest(cars);

		// Assert
		assertEquals("Ferarri", theFastest.getName());
	}

	@Test
	public void testFindingTheStrongestCarByArray_whenRequestTheStrongestCar_thenItMustReturnTheStrongest() {
		// Arrange
		Car[] cars = { new Car("BMW Series 7", 290, 380), new Car("Ferarri", 350, 570),
				new Car("Land Rover", 210, 400) };

		// Act
		Car theStrongest = (Car) Comparison.findTheBestByJavaArraysSort(cars, new CarHpComparator());

		// Assert
		assertEquals("Ferarri", theStrongest.getName());
	}

	@Test
	public void testFindingTheStrongestCarByList_whenRequestTheStrongestCar_thenItMustReturnTheStrongest() {
		// Arrange
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("BMW Series 7", 290, 300));
		cars.add(new Car("Ferarri", 350, 570));
		cars.add(new Car("Land Rover", 210, 400));

		// Act
		Car theStrongest = Comparison.findTheBestByJavaCollectionsSort(cars);

		// Assert
		assertEquals("Ferarri", theStrongest.getName());
	}

	@Test
	public void testFindingTheStrongestCarByMySearch_whenRequestTheStrongestCar_thenItMustReturnTheStrongest() {
		// Arrange
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("BMW Series 7", 290, 300));
		cars.add(new Car("Ferarri", 350, 570));
		cars.add(new Car("Land Rover", 210, 400));

		// Act
		Car theStrongest = Comparison.findTheBest(cars, new CarHpComparator());

		// Assert
		assertEquals("Ferarri", theStrongest.getName());
	}
}