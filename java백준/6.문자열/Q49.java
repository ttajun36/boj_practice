import java.util.Scanner;

class Q59 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i=0;i<n ;i++ )
		{
			int a = sc.nextInt();
			String x = sc.next();

			for (int j=0;j<x.length() ;j++ )
				for (int k=a*j;k<a*j+a ;k++ )
					System.out.print(x.charAt(j));

			System.out.println();
		}
	}
}
