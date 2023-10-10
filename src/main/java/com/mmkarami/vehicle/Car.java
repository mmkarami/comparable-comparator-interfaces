package com.mmkarami.vehicle;

public class Car implements Comparable<Car> {

	private String name;

	private int speed;

	private int hp;

	public Car(String name, int speed, int hp) {
		super();
		this.name = name;
		this.speed = speed;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int compareTo(Car other) {
		return Integer.compare(this.speed, other.getSpeed());
	}
}