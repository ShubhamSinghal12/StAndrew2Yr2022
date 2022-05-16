package Lec15;

public class MaximumCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,-2,3,4,-5,6,-100};
		System.out.println(Math.max(kadanes(arr),maxCircular(arr)));

	}
	public static int kadanes(int[] arr)
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
//		System.out.println(max);
		return max;
	}
	
	public static int maxCircular(int[] arr)
	{
		int sum = 0;
		for(int i = 0; i < arr.length;i++)
		{
			sum += arr[i];
			arr[i] *= -1;
		}
		int x = kadanes(arr);
		return sum+x;
	}

}
