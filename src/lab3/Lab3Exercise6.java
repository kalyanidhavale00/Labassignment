package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Exercise6 {

	// Method that checks whether the string is in alphabetical order or not
	public static boolean isPositiveString(String str) {

		// length of the string
		int length = str.length();

		// Create a char array of length as string
		char charstr[] = new char[length];

		// assign the string to char array
		for (int i = 0; i < length; i++) {
			charstr[i] = str.charAt(i);
		}

		// sort the char array
		Arrays.sort(charstr);

		// check if the char array is equal to string or not
		for (int i = 0; i < length; i++) {
			if (charstr[i] != str.charAt(i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// take an input from user
		System.out.println("Enter a string to check it is positive string or not: ");
		String str = sc.nextLine();

		// check given string is a positive string or not
		if (isPositiveString(str)) {
			System.out.println(str + " is a positive string");
		} else {
			System.out.println(str + " is not a positive string");
		}

	}

}
