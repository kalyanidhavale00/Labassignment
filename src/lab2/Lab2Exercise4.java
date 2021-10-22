package lab2;

import java.util.Scanner;

public class Lab2Exercise4 {
	// accepting array
	void accept(int a[], int n) {
		System.out.println("enter the elemet in an array");
		for (int i = 0; i < n; i++) {
			Scanner sc = new Scanner(System.in);
			a[i] = sc.nextInt();
		}
	}

	// display array
	void display(int[] a, int n) {
		System.out.println("elements in an array are:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		Lab2Exercise4 obj = new Lab2Exercise4();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many element you want:");
		int n = sc.nextInt();
		int a[] = new int[n];
		obj.accept(a, n);
		obj.display(a, n);
	}

}
