package lec3;

import java.util.Scanner;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i<=n)
		{
//			System.out.println(i);
			sum = sum + i;
			i += 1;
		}
		System.out.println(sum);
		System.out.println("Bye");

	}

}
