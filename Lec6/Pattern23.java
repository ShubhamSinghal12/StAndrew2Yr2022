package Lec6;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		
		int val = 1;
		
		while(row <= n)
		{
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print(" \t");
				csp+=1;
			}
			
			int cst = 1;
			int cval = val;
			while(cst <= nst)
			{
				System.out.print(cval+"\t");
				cst += 1;
				cval += 1;
			}
			
			nsp -= 1;
			nst += 2;
			row += 1;
			
//			val += 1;
			val = cval;
			System.out.println();
		}

	}

}
