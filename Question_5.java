package assignments_3;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {

		/*
		 * Question-5
		 * 
		 * Write a program that outputs the number of hours, minutes, and seconds that
		 * corresponds to input total seconds.
		 * 
		 * -Declare int variables inputSeconds, hours, minutes, seconds -Initialize the
		 * inputSeconds
		 * 
		 * -Using %(remainder) and / operators, find out how many whole hours, minutes
		 * and seconds are in inputSeconds. -Assign values to the hours, minutes,
		 * seconds variables -Display the result
		 * 
		 * Sample Output:
		 * 
		 * inputSecond is 3695
		 * 
		 * 1 hours, 1 minutes, and 35 seconds
		 * 
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Enter seconds: ");
		
		int totalSeconds = input.nextInt();
		int seconds = totalSeconds % 60;
		
		int totalMinutes = totalSeconds / 60;
		int minutes = totalMinutes % 60;
		
		int hours = totalMinutes / 60;
		
		
		System.out.println(totalSeconds + " Seconds = " + hours + " hours " + minutes + " minutes and " + seconds + " seconds");

	}
}
