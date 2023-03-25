import java.util.Scanner;

class Q71 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i=0;i<t ;i++ )
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[][] arr = new int[n+1][k];

			for (int j=0;j<k ;j++ )
				arr[0][j] = j+1;
			for (int j=1;j<n+1 ;j++ )
				arr[j][0] = 1;

			for (int j=1;j<n+1 ;j++ )
				for (int l=1;l<k ;l++ )
					arr[j][l] = arr[j-1][l] + arr[j][l-1];
			
			System.out.println(arr[n][k-1]);
		}
	}
}
