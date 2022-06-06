package Lec22;

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rw2("The  Sky  is Blue"));

	}
	public static String rw(String st)
	{
		int i = st.lastIndexOf(' ');
		String ns = "";
		while(i != -1)
		{
			ns += st.substring(i+1)+" ";
			st = st.substring(0,i);
			
			i = st.lastIndexOf(' ');
		}
		return ns + st;
	}
	public static String rw2(String st)
	{
		String[] sa = st.split(" ");
		String ns = "";
		System.out.println(Arrays.toString(sa));
		for(int i = sa.length-1; i >= 0; i--)
			if(sa[i].length()!=0)
				ns += sa[i] + " ";
		return ns;
	}

}
