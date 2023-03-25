import java.util.Scanner;

class Q67 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int x = 1;
		int count=1;
		if (n==1)
			System.out.println(count);
		else{
			while (n>x)
			{
				x = x + 6* count;
				count++;
			}

			System.out.println(count);
		}
	}
}
