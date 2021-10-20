package lab1;
import java.util.*;
public class Lab1Exercise6 {
	public int calculateDifference(int n) {
		int sum=0,k,diff;
			sum=(n*(n+1)*(2*n+1))/6;
			k=(n*(n+1))/2;
			k=k*k;
			diff=Math.abs(sum-k);
			return diff;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab1Exercise6 obj=new Lab1Exercise6();
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter how many numbers you waant");
		num=sc.nextInt();
		System.out.println("number is:"+num);
		System.out.println("Difference is:"+obj.calculateDifference(num));
		
		

	}

}
