import java.util.Scanner;

class Q62 
{
	static int func(int a){
		int[] ans = new int[3];

		for (int i=0;i<3 ;i++ ){
			ans[i] = a%10;
			a /=10;
		}

		return ans[0]*100 + ans[1]*10 + ans[2];
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (func(a) > func(b))
			System.out.println(func(a));
		else
			System.out.println(func(b));
	}
}
