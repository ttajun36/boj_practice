import java.util.Scanner;

class Q65
{
	static boolean if_Prime(int a){
		if (a==1)
			return false;
		else if (a==2)
			return true;
		else{
			for (int i=2;i<a ;i++ )
				if (a%i == 0)
					return false;

			return true;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();

		int count = 0;
		int sum = 0;

		for (int i=m;i<=n ;i++ )
			if (if_Prime(i)){
				sum+=i;
				if (count == 0)
					count = i;
			}

		if (count == 0)
			System.out.println(-1);
		else{
			System.out.println(sum);
			System.out.println(count);
		}
	}
}
