import java.util.Scanner;

class Q85 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(factorial(n));
	}

	static int factorial(int a){
		if (a == 0)
			return 1;
		else if (a<3)
			return a;
		else
			return a* factorial(a-1);
	}
}
