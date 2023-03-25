import java.util.Scanner;

class Q86 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println(fibo(sc.nextInt()));
	}

	static int fibo (int a){
		if (a == 0)
			return 0;
		else if (a==1 || a==2)
			return 1;
		else
			return fibo(a-1) + fibo(a-2);
	}
}
