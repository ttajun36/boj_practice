import java.util.Scanner;

class Q23 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		int a,b;

		for (int i=0;i<t ;i++ )
		{
			a = in.nextInt();
			b = in.nextInt();

			System.out.println(a+b);
		}
	}
}
