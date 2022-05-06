package Lec12;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,1,2,4};
		SS(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static int minI(int[] arr,int i)
	{
		int min = i;
		for(int j = i+1; j < arr.length; j++)
		{
			if(arr[min] > arr[j])
				min = j;
		}
		return min;
	}
	public static void SS(int[] arr)
	{
		for(int i = 0; i <arr.length-1; i++)
		{
			int m = minI(arr,i);
			
			int t = arr[i];
			arr[i] = arr[m];
			arr[m] = t;
		}
	}

}
