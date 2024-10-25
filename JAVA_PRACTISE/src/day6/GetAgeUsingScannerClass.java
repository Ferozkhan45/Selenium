package day6;

import java.util.Calendar;
import java.util.Scanner;

public class GetAgeUsingScannerClass {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Prompt user for birth year
        System.out.print("Enter your birth year (yyyy): ");
        int birthYear = sc.nextInt();

        // Get the current year
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        // Calculate the age
        int age = currentYear - birthYear;

        // Output the age
        System.out.println("Your age is: " + age + " years.");

        // Close the scanner
        sc.close();
	}

}
