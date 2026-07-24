package com.vviet.ticket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the details separated by commas (Stage Event, Name, Number of seats): ");
		String inputString = scanner.nextLine();

		// Parse the input
		String[] details = inputString.split(",");
		TicketBooking booking = new TicketBooking(details[0].trim(), details[1].trim(), Integer.parseInt(details[2].trim()));

		// Print the ticket details
		System.out.println("Stage event: " + booking.getStageEvent());
		System.out.println("Customer: " + booking.getCustomer());
		System.out.println("Number of seats: " + booking.getNoOfSeats());

		// Payment choice
		System.out.println("------Payment modes------");
		System.out.println("1. Cash payment");
		System.out.println("2. Wallet payment");
		System.out.println("3. Credit card payment");
		System.out.print("Enter payment mode: ");
		int choice = Integer.parseInt(scanner.nextLine());
		switch (choice) {
		case 1:
			System.out.println("------Make payment by cash------");
			System.out.print("Enter the amount: ");
			double amount = Double.parseDouble(scanner.nextLine());
			booking.makePayment(amount);
			break;

		case 2:
			System.out.println("------Make payment by wallet------");
			System.out.print("Enter the amount: ");
			amount = Double.parseDouble(scanner.nextLine());
			System.out.print("Enter the Wallet Number: ");
			String walletNumber = scanner.nextLine();
			booking.makePayment(walletNumber, amount);
			break;
		case 3:
			System.out.println("------Make payment by Card------");
			System.out.print("Enter the amount: ");
			amount = Double.parseDouble(scanner.nextLine());
			System.out.print("Enter the card holder name: ");
			String holder = scanner.nextLine();
			System.out.print("Enter the card name: ");
			String creditCard = scanner.nextLine();
			System.out.print("Enter the CCV: ");
			String ccv = scanner.nextLine();
			booking.makePayment(creditCard, ccv, holder, amount);
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}

}
