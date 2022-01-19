package com.dd.project;
import java.util.*;
class LongestIncreasingSubsequences {
	static int max_ref;

	static int LIS(int arr[], int n)
	{
		if (n == 1)
			return 1;

		int res, max_ending_here = 1;

		for (int i = 1; i < n; i++) {
			res = LIS(arr, i);
			if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}

		if (max_ref < max_ending_here)
			max_ref = max_ending_here;

		return max_ending_here;
	}

	static int lis(int arr[], int n)
	{
		max_ref = 1;

		LIS(arr, n);

		
		return max_ref;
	}

	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the string");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the array elements");
		for(int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		int n = arr.length;
		System.out.println("Length of lis is "
						+ lis(arr, n) + "\n");
		sc.close();
	}
}