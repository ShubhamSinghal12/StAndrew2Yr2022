package Lec14;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,-2,3,14,-5,6,-7,-8,9};
		printSA(arr);
		System.out.println("---------------------------");
		SumSA2(arr);
		System.out.println("---------------------------");
		kadanes(arr);

	}
	public static void printSA(int[] arr)
	{
		for(int i = 0 ; i<arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
//				System.out.println(i+" "+j);
				for(int k = i; k <= j; k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static void SumSA(int[] arr)
	{
		for(int i = 0 ; i<arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
//				System.out.println(i+" "+j);
				int sum = 0;
				for(int k = i; k <= j; k++)
				{
//					System.out.print(arr[k]+" ");
					sum += arr[k];
				}
				System.out.println(sum);
			}
		}
	}
	public static void SumSA2(int[] arr)
	{
		for(int i = 0 ; i<arr.length; i++)
		{
			int sum = 0;
			for(int j = i; j < arr.length; j++)
			{
//				System.out.println(i+" "+j);
				sum += arr[j];
				System.out.println(sum);
			}
		}
	}
	
	
	public static void MaxSumSA(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i<arr.length; i++)
		{
			int sum = 0;
			for(int j = i; j < arr.length; j++)
			{
//				System.out.println(i+" "+j);
				sum += arr[j];
				if(max < sum)
					max = sum;
//				System.out.println(sum);
			}
		}
		System.out.println(max);
	}

	public static void kadanes(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i: arr)
		{
			sum += i;
			if(sum > max)
			{
				max = sum;
			}
			if(sum < 0)
			{
				sum = 0;
			}
		}
		System.out.println(max);
	}
}
