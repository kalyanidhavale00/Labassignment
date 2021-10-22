package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3Exercise1 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer string:");
		String s=sc.next();
		StringTokenizer st =new StringTokenizer(s,",");
		int sum=0;
		while(st.hasMoreTokens()) {
			int n=0;
			n=Integer.parseInt(st.nextToken());
			System.out.println("number is:"+n);
			sum=sum+n;
		}
		System.out.println("Sum of the numbers is:"+sum);
	}

}
