import java.util.Scanner;

class Q24 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int ans = 0;
		
		for (int i=0;i<n ;i++ )
			ans += i + 1;
		System.out.println(ans);
	}
}
