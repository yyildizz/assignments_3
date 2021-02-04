package assignments_3;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		/*
		 * Question-1 Write a program to convert gallons into Liters and display it.
		 * Sample output: 15 gallon is 56.7812 liter
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Gallons: ");
		double gallons = input.nextDouble();

		// 1 US gallon = 3.78541178 liters //

		double liters = gallons * 3.78541178;

		System.out.println(gallons + " gallon is " + liters + " liter");

	}

}