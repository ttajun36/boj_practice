import java.util.Scanner;

class Q27
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i=0;i<t ;i++ )
			System.out.printf("Case #%d: %d\n", i+1, sc.nextInt() + sc.nextInt());
	}
}
