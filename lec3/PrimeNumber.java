package lec3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int n = 2;
		while (n <= num) {
			int count = 0;
			boolean flag = true;
			
			int i = 2;
			while(i<=n-1)
			{
				if(n%i==0)
				{
//					System.out.println(i);
					count = 1;
					flag = false;
				}
				i += 1;
			}
//			System.out.println(count);
			if(flag)
			{
				System.out.println(n);
			}
//			else
//			{
//				System.out.println("Not Prime");
//			}
			n += 1;
		}

	}

}
