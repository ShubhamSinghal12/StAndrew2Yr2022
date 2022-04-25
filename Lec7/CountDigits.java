package Lec7;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		int t = n;
		
		int count = 0;
		while(n!= 0)
		{
			count++;
			n /= 10;
		}
		System.out.println(count);
		System.out.println((int)Math.log10(t)+1);

	}

}
