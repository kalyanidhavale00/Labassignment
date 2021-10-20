package day2;

import java.util.Scanner;

public class LabExercise3 {
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

	// main logic
	int getSorted(int a[], int n) {
		System.out.println("Array in reverse order");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
		System.out.println();
		System.out.println("after sorting array in ascending order:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		return 0;
	}

	public static void main(String[] args) {
		LabExercise3 obj = new LabExercise3();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many element you want:");
		int n = sc.nextInt();
		int a[] = new int[n];
		obj.accept(a, n);
		obj.display(a, n);
		obj.getSorted(a, n);

	}

}
