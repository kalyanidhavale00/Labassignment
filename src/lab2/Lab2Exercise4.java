package lab2;

import java.util.Scanner;

public class Lab2Exercise4 {
	// accepting array
	void accept(int a[], int n) {
		System.out.println("enter the element in an array");
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

	int modifyArray(int[] a, int n) {
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
		if (n == 0 || n == 1)
			return n;
		int temp1[] = new int[n];
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1])
				temp1[j++] = a[i];
		}
		for (int i = 0; i < j; i++)
			a[i] = temp1[j];
		return j;

	}

	public static void main(String[] args) {
		Lab2Exercise4 obj = new Lab2Exercise4();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many element you want:");
		int n = sc.nextInt();
		int a[] = new int[n];
		obj.accept(a, n);
		obj.display(a, n);
		System.out.println();
	     obj.modifyArray(a, n);
		for (int i = 0; i < n; i++) {
			System.out.println(a[i] + " ");
		}

	}

}
