import java.util.Scanner;

class Q66 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		long i = 0;

		if (c>b)
			System.out.println(a/(c-b) + 1);
		else
			System.out.println(-1);
	}
}
