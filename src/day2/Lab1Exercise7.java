package day2;
import java.util.*;

public class Lab1Exercise7 {
	boolean checkNumber(int number)
	{
		boolean flag = false;
		int digit= number%10;
		 number=number/10;
		 while(number>0)
		 {
			 if(digit<=number%10)
			 {
				flag=true;
				break;
			 }
			 digit= number%10;
			 number=number/10;
		 }
		 if(flag==true)
		 return true;
		 else
			 return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lab1Exercise7 obj=new Lab1Exercise7();
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		System.out.println("number is:"+num);
		boolean n=obj.checkNumber(num);
		if(n==true)
		{
			System.out.println("number is  not in increasing order");
		}
		else
			System.out.println("number is  in increasing order");

	}

}
