import java.util.Scanner;

class Q70 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i=0;i<t ;i++ )
		{
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			if ((n-1)/h+1<10)
				System.out.printf("%d0%d\n", (n-1)%h+1, (n-1)/h+1);
			else
				System.out.printf("%d%d\n", (n-1)%h+1, (n-1)/h+1);
		}
	}
}
