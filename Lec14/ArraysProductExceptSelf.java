package Lec14;

import java.util.Arrays;

public class ArraysProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		APES3(arr);

	}
	
	public static void APES1(int[] arr)
	{
		int[] ans = new int[arr.length];
		for(int i = 0; i < arr.length; i++ )
		{
			int p = 1;
			for(int j = 0; j < arr.length; j++)
			{
				if(i!=j)
				{
					p *= arr[j];
				}
			}
			ans[i] = p;
		}
		System.out.println(Arrays.toString(ans));
	}
	
	public static void APES2(int[] arr)
	{
		int[] lp = new int[arr.length];
		int[] rp = new int[arr.length];
		int[] ans = new int[arr.length]; 
		
		int p = 1;
		for(int i = 0; i < arr.length;i++)
		{
			lp[i] = p;
			p *= arr[i];
		}
		p = 1;
		for(int j = arr.length-1; j >= 0; j--)
		{
			rp[j] = p;
			p *= arr[j];
		}
		
		for(int i = 0; i < arr.length;i++)
		{
			ans[i] = lp[i]*rp[i];
		}
		
		System.out.println(Arrays.toString(lp));
		System.out.println(Arrays.toString(rp));
		System.out.println(Arrays.toString(ans));
	}
	
	public static void APES3(int[] arr)
	{
		int[] lp = new int[arr.length];
//		int[] rp = new int[arr.length];
//		int[] ans = new int[arr.length]; 
		
		int p = 1;
		for(int i = 0; i < arr.length;i++)
		{
			lp[i] = p;
			p *= arr[i];
		}
		p = 1;
		for(int j = arr.length-1; j >= 0; j--)
		{
			lp[j] = lp[j]*p;
			p *= arr[j];
		}
		
//		for(int i = 0; i < arr.length;i++)
//		{
//			ans[i] = lp[i]*rp[i];
//		}
		
		System.out.println(Arrays.toString(lp));
//		System.out.println(Arrays.toString(rp));
//		System.out.println(Arrays.toString(ans));
	}

}
