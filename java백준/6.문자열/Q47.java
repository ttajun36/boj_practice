import java.util.Scanner;

class Q57 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String x = sc.next();

		int ans = 0;

		for (int i=0;i<n ;i++ )
			ans += Integer.valueOf(x.substring(i,i+1));

		System.out.println(ans);

		System.out.println('9' - '5');
	}
}
