package com.Xworkz.controlStatement;

public class RoadTax {

	public static void main(String[] args) {

		int price = 5000;
		double taxAmount;
		String states = "KA";
		if (states == "KA") {
			taxAmount = price * 0.7 / 100;
			System.out.println("Road tax amount of Karnataka is = " + taxAmount);
		} else if (states == "TN") {
			taxAmount = price * 0.8 / 100;
			System.out.println("Road tax amount of Tamil Nadu is = " + taxAmount);
		} else if (states == "AP") {
			taxAmount = price * 0.12 / 100;
			System.out.println("Road tax amount of Andhra Pradesh is = " + taxAmount);
		} else if (states == "TS") {
			taxAmount = price * 0.9 / 100;
			System.out.println("Road tax amount of Telangana is = " + taxAmount);
		}

	}

}
