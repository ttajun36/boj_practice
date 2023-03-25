import java.util.Scanner;

class Q19 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int h = in.nextInt();
		int m = in.nextInt();

		if (m>44)
			System.out.printf("%d %d", h, m-45);
		else
			if (h == 0 )
				System.out.printf("%d %d", 23, m+15);
			else
				System.out.printf("%d %d", h-1, m+15);
	}
}
