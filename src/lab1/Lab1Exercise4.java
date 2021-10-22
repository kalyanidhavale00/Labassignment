package lab1;

import java.util.Scanner;

public class Lab1Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("enter the range of prime number:");
		int n = sc.nextInt();
		System.out.println("prime number between 1 to" + n + "are:");
		for (int i = 2; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
					// 10
					// break;
				}
			}
			if (count == 2)
				System.out.println(" " + i);
			count = 0;
		}
	}

}
