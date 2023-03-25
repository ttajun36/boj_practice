import java.util.Scanner;

class Q70 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][][] arr = new int [2][n][m];
		
		for (int k=0;k<2 ;k++ )
		{
			for (int i=0;i<n ;i++ )
			{
				for (int j=0;j<m ;j++ )
				{
					arr[k][i][j] = sc.nextInt();
				}
			}
		}

		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<m ;j++ )
			{
				System.out.print(arr[0][i][j] + arr[1][i][j]+ " "); 
			}
			System.out.println();
		}
	}
}
