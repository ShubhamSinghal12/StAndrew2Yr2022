package Lec21;

import java.util.Scanner;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello!!! I am llCB";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
		Scanner sc = new Scanner(System.in);
//		String st = sc.next();
//		System.out.println(s1.charAt(0));
////		System.out.println(st);
//		System.out.println(s1.substring(2,5));
//		System.out.println(s1.substring(5));
//		System.out.println(s1.startsWith("Helo"));
//		System.out.println(s1.endsWith("CBF"));
//		System.out.println(s1.indexOf("lll"));
//		System.out.println(s1.lastIndexOf("ll"));
//		System.out.println(s1.replace('l', 'r'));
//		System.out.println(s1);
//		System.out.println(s1.concat(" Bye"));
		
		
		String st = "";
		long start = System.currentTimeMillis();
		for(int i = 1; i <= 1000000;i++)
		{
			st = st + "a";
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		

	}

}
