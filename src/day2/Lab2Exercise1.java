package day2;

import java.util.Scanner;

public class Lab2Exercise1 {
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

//finding second smallest number
	int getSecondSmallest(int a[], int n) {
		int firstSmall;
		int secondSmall;
		if (a[0] < a[1]) {
			firstSmall = a[0];
			secondSmall = a[1];
		} else {
			firstSmall = a[1];
			secondSmall = a[0];
		}
		for (int i = 2; i < n; i++) {
			if (a[i] < firstSmall) {
				secondSmall = firstSmall;
				firstSmall = a[i];
			} else if (a[i] > firstSmall && a[i] < secondSmall) {
				secondSmall = a[i];
			}

		}
		return secondSmall;
	}

	public static void main(String[] args) {
		Lab2Exercise1 obj = new Lab2Exercise1();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many element you want:");
		int n = sc.nextInt();
		int a[] = new int[n];
		obj.accept(a, n);
		obj.display(a, n);
		int small = obj.getSecondSmallest(a, n);
		System.out.println();
		System.out.println("second largest element in array is:" + small);

	}
}
