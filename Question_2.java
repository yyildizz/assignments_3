package assignments_3;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {

		/*
		 * Question-2
		 * 
		 * Write a program - > Declare variables for your name and birth year, and the
		 * program will display:
		 * 
		 * " Hello, Ozzy! Based on your input, your age is 15 :) "
		 * 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name please: ");
		String name = input.next();

		System.out.println("Enter your birth year: ");
		int year = input.nextInt();

		System.out.println("Hello " + name + "! Based on your input, your age is " + (2020 - year) + " :) ");

	}

}