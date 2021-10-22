package lab1;

import java.util.Scanner;

public class Lab1Exercise5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		System.out.println("sum of natural number which is divisible by 3 & 5: "+calculateSum(n));
	}

	 static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}

}
