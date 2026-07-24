package com.vviet.airfare;

public class AirIndia implements Airfare {
	private int hours = 0;
	private double costPerHour = 0.0;

	public AirIndia() {
	}

	public AirIndia(int hours, double costPerHour) {
		this.hours = hours;
		this.costPerHour = costPerHour;
	}

	// Getter and setter methods for hours
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	// Getter and setter methods for costPerHour
	public double getcostPerHour() {
		return costPerHour;
	}

	public void setcostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}

	@Override
	public double calculateAmount() {
		return hours * costPerHour;
	}
}