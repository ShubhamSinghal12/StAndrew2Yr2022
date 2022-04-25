package Lec7;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 42;
		int ans = 0;
		int multi = 1;
		int base = 8;
		while(n!=0)
		{
			int rem = n%base;
			ans = ans + rem*multi;
			
			multi = multi*10;
			n = n/base;
		}
		System.out.println(ans);

	}

}
