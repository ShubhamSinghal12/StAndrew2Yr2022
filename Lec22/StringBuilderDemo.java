package Lec22;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder st = new StringBuilder("Hello");
		StringBuilder st2 = new StringBuilder("Hello");
		StringBuilder st3 = st;
		System.out.println(st.length());
		System.out.println(st == st3);
		st.append(" Bye!!");
		
		System.out.println(st2);
		st2.insert(2, "RRRR");
		System.out.println(st2);
		st2.setCharAt(2, 'Y');
		System.out.println(st2);
		st2.deleteCharAt(2);
		System.out.println(st2);
		st2.delete(2, 5);
		System.out.println(st2);
		
		String s = st2.substring(0,3);
		System.out.println(s);
		
		StringBuilder ns = new StringBuilder();
		long start = System.currentTimeMillis();
		for(int i = 1; i <= 1000000;i++)
		{
			ns.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		String n = st2.toString();
		

	}

}
