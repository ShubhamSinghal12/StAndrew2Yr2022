package Lec8;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = (byte)673;
		System.out.println(b);
		short s  = 10;
		int i = 10;
		long l = 10l;
		
		float f = 10.01f;
		double d = 10.1;
		
		b = (byte)s;
		
		s = b;
		s = (short)i;
		
		i = s;
		i = (int)l;
		i = (int)f;
		
		l = i;
		l = (long)f;
		
		f = l;
		f = (float)d;
		
//		i = 10.2*100000;
		
		char ch = 'a';
//		ch = (char)(ch + 1);
		char c = 'b';
//		ch = ch + c;
		System.out.println(ch);
		
		String st = "abc";
//		st = st + 123;
		System.out.println(2+3+st+2+3);
		
		

	}

}
