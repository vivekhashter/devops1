package ito;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		int n=2;
		System.out.println("Enter nth largest number");
		int[] arr = new int[] {1,3,10,15};

		int ans = greatest(arr, n);
		System.out.println("largest element is = " + ans);

	
	}

	public static int greatest(int arr[], int n) 
		 
		{
			
			return arr[arr.length-n];
			
	}


}