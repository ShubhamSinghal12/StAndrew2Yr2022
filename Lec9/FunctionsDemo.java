package Lec9;

public class FunctionsDemo {
	
	public static int glo = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int a = 10;
		int b = 20;
//		int c = add(a,b);
//		System.out.println(c);
//		sub(100,20);
//		add(100,200);
		System.out.println(glo);
		global();
		System.out.println("Bye");

	}
	public static void sub(int a,int b) {
		
		int c = a-b;
		System.out.println(c);
	}
	public static int add(int a,int b) {
		
		
		int c = a+b;
//		sub(a, b);
//		System.out.println(c);
		return c;
	}
	public static void global()
	{
		int glo = 10;
		System.out.println(FunctionsDemo.glo);
	}

}
