import java.util.Scanner;

class Q25 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int total = in.nextInt();
		int n = in.nextInt();
		int cost=0;
		int a, b;

		for (int i=0;i<n ;i++ ){
			a = in.nextInt();
			b = in.nextInt();

			cost += a*b;
		}

		if (cost == total)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
