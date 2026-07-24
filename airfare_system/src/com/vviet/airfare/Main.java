package com.vviet.airfare;

public class Main {
	public static void main(String args[]) {
		// Create objects for each airline
		AirIndia airIndia = new AirIndia(5, 1500.0);
		KingFisher kingFisher = new KingFisher(5, 1500.0);
		Indigo indigo = new Indigo(5, 1500.0);

		// Print the Airfare
		System.out.printf("Airindia airfare: %.2f\n", airIndia.calculateAmount());
		System.out.printf("Kingfisher airfare: %.2f\n", kingFisher.calculateAmount());
		System.out.printf("Indigo airfare: %.2f\n", indigo.calculateAmount());
	}
}