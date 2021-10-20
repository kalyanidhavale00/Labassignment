package day2;

public class MinMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[] {1,2,3,4,5};
		System.out.println("original Array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("maximun element is"+max);
		System.out.println("minimum element in an array is:"+min);

	}

}
