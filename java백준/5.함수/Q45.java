import java.util.Scanner;

class Q55
{
	public static boolean hansu(int x){
		int a = x%10;
		int c = x/100;
		int b = x/10 - c*10;

		if (a-b == b-c)
			return true;
		else
			return false;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc. nextInt();

		if (n<100)
			System.out.println(n);
		else{
			int count = 99;

			for (int i=100;i<n+1 ;i++ )
				if (hansu(i))
					count++;

			System.out.println(count);
		}
	}
}
