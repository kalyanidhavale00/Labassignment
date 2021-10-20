package lab1;

import java.util.Scanner;

public class Lab1Exercise2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("colours:");
	System.out.println("1.Red \n2.Yellow\n2.Green");
	System.out.println("Enter your choice:");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		 System.out.println("Stop");
		 break;
	case 2:
		  System.out.println("Reday");
		  break;
	case 3:
		System.out.println("Go");
		break;
	default:
		System.out.println("Please enter valid number");
	}
	

	}

}
