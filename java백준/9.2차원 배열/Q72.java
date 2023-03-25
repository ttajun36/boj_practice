import java.util.Scanner;

class Q72 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] paper = new int[100][100];

		for (int k=0;k<n ;k++ )
		{
			int a = sc.nextInt();
			int b = sc.nextInt();

			for (int i=0;i<10 ;i++ )
				for (int j=0;j<10 ;j++ )
					if (paper[a+i][b+j] == 0)
						paper[a+i][b+j] = 1;
		}
		
		int count=0;
		for (int i=0;i<100 ;i++ )
			for (int j=0;j<100 ;j++ )
				if (paper[i][j] == 1)
					count++;
		
		System.out.println(count);
	}
}
