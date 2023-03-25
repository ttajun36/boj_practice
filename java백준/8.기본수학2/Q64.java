import java.util.Scanner;

class Q64 
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

		int n = sc.nextInt();
		int count = 0;
		for (int i=0;i<n ;i++ )
			if(if_Prime(sc.nextInt()))
				count++;

		System.out.println(count);
	}
}
