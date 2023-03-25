import java.util.Scanner;

class Q22 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		for (int i=0;i<9 ;i++ )
			System.out.printf("%d * %d = %d\n", n, i+1, n*(i+1));
	}
}
