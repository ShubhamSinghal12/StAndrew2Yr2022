package lec3;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HI");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks >= 85)
		{
			System.out.println("A");
		}
		else if(marks >= 65)
		{
			System.out.println("B");
		}
		else if(marks >= 45)
		{
			System.out.println("C");
		}
		else {
			System.out.println("Fail");
		}
		
		
		

	}

}
