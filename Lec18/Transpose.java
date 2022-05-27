package Lec18;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		display(arr);
		System.out.println("----------------------");
		transpose(arr);
		display(arr);

	}
	
	public static void transpose(int[][] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			for(int j = 0; j < i;j++)
			{
				int t = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = t;
			}
		}
	}
	public static void display(int[][] arr)
	{
		for(int[] i :arr)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
