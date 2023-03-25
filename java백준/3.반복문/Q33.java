import java.util.Scanner;

class Q33 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 0;
		int ans = n;

		while (true)
		{
			ans = (ans%10)*10 + (ans/10+ans%10)%10;
			count++;

			if (ans == n)
				break;
		}
		
		System.out.println(count);		
	}
}
