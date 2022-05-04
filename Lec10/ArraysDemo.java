package Lec10;

import java.util.Scanner;

public class ArraysDemo {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr,c;
//		arr = new int[5];
//		System.out.println(arr);
//		System.out.println(arr.length);
//		arr[1] = 100;
//		System.out.println(arr[1]);
//		
//		int brr[],d;
//		brr = new int[5];
//		
//		brr[1]=10;
//		System.out.println(brr[1]);
//		
//		brr = arr;
//		System.out.println(brr[1]);
		
//		int[] arr = takeInput(5);
		int[] arr;
		arr = new int[]{1,2,3,4,5};
		
		display(arr);
		display(arr);
//		System.out.println(arr[2]);
		
		

	}
	public static void display(int[] arr)
	{
//		arr[2] = 1000;
//		for(int i = 0; i < arr.length; i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		int ind = 0;
		for(int i:arr)
		{
			System.out.print(i+" ");
			arr[ind] *= 10; 
			ind++ ;
		}
		System.out.println();
	}
	
	public static int[] takeInput(int n)
	{
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		return arr;
	}

}
