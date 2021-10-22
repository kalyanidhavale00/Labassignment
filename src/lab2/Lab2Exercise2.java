package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many element you want");
		int n = sc.nextInt();
		String[] strArray = new String[n];
		accept(strArray, n);
		display(strArray,n);
		sortString(strArray, n);
		System.out.println();
		System.out.println("After sorting String Array is:");
		display(strArray,n);
	}

	static void display(String[] strArray, int n) {
		System.out.println("String array elements are:");
			System.out.print(Arrays.toString(strArray)+" ");
		
	}

	static void sortString(String[] strArray, int n) {
		Arrays.sort(strArray);

	}

	static void accept(String[] strArray, int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements in an String Array:");
		for (int i = 0; i < n; i++) {
			strArray[i] = sc.nextLine();
		}

	}

}
