package day2;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[] {1,2,3,4,5};
		int sum=0;
		System.out.println("original Array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
         System.out.println("sum of elements in an array is:"+sum);
	}

}
