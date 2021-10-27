/*
 * Validate the age of a person and display proper message by using user defined exception.
 *  Age of a person should be above 15.
 *  */
package lab5;

import java.util.Scanner;

public class Lab5Exercise1 {

	public static void main(String[] args) throws InvalidaAgeException {
		// Enter the age from user
		System.out.println("Enter the age:");
		Scanner sc = new Scanner(System.in);
		int age1 = sc.nextInt();
		ageValidation(age1);
	}

	public static void ageValidation(int age) throws InvalidaAgeException {
		// check if enter age is greater than 15 or not otherwise throw an user define
		// Exception
		if (age < 15) {

			throw new InvalidaAgeException("Age of a person should be above 15");
		}
	}

}
