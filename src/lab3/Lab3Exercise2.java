package lab3;

import java.util.Scanner;

public class Lab3Exercise2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.nextLine();
	getImage(str);
	}

	static void getImage(String str) {
		StringBuffer sb=new StringBuffer(str);
		StringBuffer str1=sb.reverse();
		System.out.println("mirror image :"+str+"|"+str1);
		
	}

}
