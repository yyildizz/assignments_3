package assignments_3;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {

		/*
		 * Question-6
		 * 
		 * Scientists estimate that roughly 10 grams of caffeine consumed at one time is
		 * a lethal overdose.
		 * 
		 * Write a program with a variable that holds the number of milligrams of
		 * caffeine in a drink and outputs how many drinks it takes to kill a person.
		 * 
		 * Sample Output
		 * 
		 * Number of milligrams in drink: 500 It would take about 20 drinks for a lethal
		 * overdose
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of milligrams in drink: ");

		int milligram = input.nextInt();

		// 10 gram is equal to 10000 milligram //

		System.out.println("It would take about " + (10000 / milligram) + " drinks for a lethal overdose. ");

	}
}
