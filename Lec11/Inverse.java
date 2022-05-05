package Lec11;

import java.util.Arrays;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,0,2,3};
		
//		int[] inv = new int[arr.length];
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			inv[arr[i]] = i;
//		}
//		System.out.println(Arrays.toString(inv));
////		System.out.println(arr==inv);
//		boolean f = true;
//		for(int i = 0; i < arr.length ; i++)
//		{
//			if(arr[i] != inv[i])
//			{
//				f = false;
//				break;
//			}
//		}
//		System.out.println(f);
		
		boolean f = true;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[arr[i]] != i) {
				f = false;
				break;
			}
		}
		System.out.println(f);
		

	}

}
