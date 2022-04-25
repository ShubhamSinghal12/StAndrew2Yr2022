package Lec7;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 52;
		int ans = 0;
		int multi = 1;
		int base = 8;
		while(n!=0)
		{
			int rem = n%10;
			ans = ans + rem*multi;
			
			multi = multi*base;
			n = n/10;
		}
		System.out.println(ans);

	}

}
