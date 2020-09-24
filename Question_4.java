package assignments_3;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {

		/*
		 * Question-4
		 * 
		 * Declare 2 variables (Num1, Num2)
		 * 
		 * Swap values between Num1 and Num2
		 * 
		 * Display new values of Num1 and Num2
		 * 
		 * Sample output:
		 * 
		 * n1=10 n2=20
		 * 
		 * ----------
		 * 
		 * n1=20 n2=10
		 * 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int num1 = input.nextInt();

		System.out.println("Enter the second number: ");
		int num2 = input.nextInt();

		System.out.println("You entered " + num1 + " and " + num2);
		int temporaryNumber = num1;
		num1 = num2;
		num2 = temporaryNumber;

		System.out.println("After swap " + num1 + " and " + num2);

	}
}
