package day2;

import java.util.Scanner;

public class Lab1Exercise8 {
	public boolean checkNumber(int n)
	{
		while(n%2==0)
		{
			n=n/2;
		}
		if(n==1)
		{
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab1Exercise8 obj=new Lab1Exercise8();
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		System.out.println("number is:"+num);
		boolean n=obj.checkNumber(num);
		if(n==true)
		{
			System.out.println("number is power of two");
		}
		else
			System.out.println("number is not  power of two");

	}

}
