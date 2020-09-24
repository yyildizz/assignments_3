package assignments_3;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {

		/*
		 * Question-7
		 * 
		 * Write a program that determines the change to be dispensed from a vending
		 * machine. An item in the machine can cost between 25 cents and 1 dollar, in
		 * 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), and the machine
		 * accepts only a single dollar bill to pay for the item.
		 * 
		 * Sample output
		 * 
		 * Price in cents : 95
		 * 
		 * Your change is 0 quarters, 0 dimes, and 1 nickels
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the price in cents: ");

		int change = 100-input.nextInt();

		// 1 nickel is 5 cents
		// 1 dime is 10 cents
		// 1 quarter is 25 cents

		int quarters = change / 25 ;
		
		change = change % 25 ;
		
		int dimes = change / 10 ;
		
		change = change % 10 ;
		
		int nickels = change / 5 ;
		
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels");

	}
}
