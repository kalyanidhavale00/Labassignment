package day2;

public class SortArrray {

	public static void main(String[] args) {
		
		int arr[] = new int[] { 6, 3, 9, 2, 67, 87, 13 };
		int sum = 0;
		System.out.println("original Array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println();
		System.out.println("after sorting array in ascending order:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int temp1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					temp1 = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp1;

				}
			}
		}
		System.out.println();
		System.out.println("after sorting array in descending order:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
