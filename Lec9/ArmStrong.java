package Lec9;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isArmstrong(153));
		printAllArmStrong(1000);

	}
	
	public static int countDigits(int n)
	{
		int d = (int)Math.log10(n)+1;
		return d;
	}
	
	public static boolean isArmstrong(int n)
	{
		int d = countDigits(n);
		int sum = 0;
		int t = n;
		while(n!= 0)
		{
			int rem = n%10;
			sum += (int)Math.pow(rem, d);
			n /= 10;
		}
		
		return sum == t;
	}
	
	public static void printAllArmStrong(int n)
	{
		for(int i = 1;i <= n; i++)
		{
			if(isArmstrong(i))
			{
				System.out.println(i);
			}
		}
	}
	

}
