package ito;
import java.util.*; 

public class array {

	public static void main(String[] args) {
		int n;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter nth largest number");
		n = scn.nextInt();
		int[] arr = new int[] {1, 5, 5, 10 , 10, 15, 15};

		int ans = greatest(arr, n);
		System.out.println("largest element is = " + ans);

	}
	 

	public static int greatest(int arr[], int n) {
		 
		{
			
			
			int s=arr.length;
			int c=1;			
			for(int i=s-1;i>0;i--)
			{
				if(arr[i]!=arr[i-1])c++;
				if(c==n)return arr[i-1];
			}
			return -1;
		}

	}


	}


