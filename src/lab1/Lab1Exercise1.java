package lab1;

import java.util.Scanner;

public class Lab1Exercise1 {
    /*
     * Sum of the cube of the digit of an n digit number*/
	
	int displaySum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
			int cube=digit*digit*digit;
			sum=sum+cube;
			n=n/10;
		}
	return sum;	
	}

	public static void main(String[] args) {
		Lab1Exercise1 obj=new Lab1Exercise1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Sum of cubes of the digit of the number is:"+obj.displaySum(n));

	}
}

