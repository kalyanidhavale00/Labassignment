package lab1;

import java.util.Scanner;

public class Lab1Exercise3 {

	public static void main(String[] args) {
		int a = 0, b = 1;
		int a1 = 0, b1 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many terms you want");
		int n1 = sc.nextInt();
		System.out.println("Fibonacii series using non recurrsion method ");
		System.out.println(+a + " " + b);
		fibo(n1);
		System.out.println();
		/*
		 * System.out.println("enter how many terms you want"); int n=sc.nextInt();
		 * System.out.println("Fibonacii series using recurrsion method:"+a+" "+b);
		 * fibonaciiRecursive(n-2);
		 */

	}

	/*
	 * static void fibonaciiRecursive(int n) { int c=0; int a1=0,b1=1; if(n>0) {
	 * c=a1+b1; a1=b1; b1=c; System.out.println(" "+c); fibonaciiRecursive(n-1);
	 * 
	 * }
	 * 
	 * }
	 */

	static void fibo(int n1) {
		int c;
		int a = 0;
		int b = 1;
		for (int i = 2; i < n1; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}

	}

}
