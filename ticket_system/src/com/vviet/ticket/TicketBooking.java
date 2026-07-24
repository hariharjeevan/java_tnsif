package com.vviet.ticket;

public class TicketBooking {
	private String stageEvent;
	private String customer;
	private Integer noOfSeats;

	public TicketBooking() {
		stageEvent = "";
		customer = "";
		noOfSeats = 0;
	}

	public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}

	// Getters and setters for the attributes
	public String getStageEvent() {
		return stageEvent;
	}

	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Integer getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	// Methods
	public void makePayment(Double amount) {
		System.out.println("------Transaction details------");
		System.out.printf("Amount %.1f paid in cash.\n", amount);
	}

	public void makePayment(String walletNumber, Double amount) {
		System.out.println("------Transaction details------");
		System.out.printf("Amount %.1f paid using wallet.\n", amount);
		System.out.printf("Wallet Number: %s\n", walletNumber);
	}

	public void makePayment(String creditCard, String ccv, String name, Double amount) {
		System.out.println("------Transaction details------");
		System.out.printf("Holder Name: %s\n", name);
		System.out.printf("Amount %.1f paid using %s card.\n", amount, creditCard);
		System.out.printf("CCV: %s\n", ccv);
	}

}
