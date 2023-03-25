import java.util.Scanner;
import java.util.ArrayList;

class Q67
{
	static boolean if_Prime(int a, ArrayList<Integer> prime){
		if (a==1)
			return false;
		else if (a==2)
			return true;
		else{
			for (int i=0;i<prime.size() ;i++ ){
				if (a%prime.get(i) == 0)
					return false;
            
			    if (prime.get(i) > Math.sqrt(a))
					break;
			}

			return true;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();

		ArrayList<Integer> prime = new ArrayList<Integer>();

		for (int i=2;i<=n ;i++ )
		{
			if (if_Prime(i, prime))
			{
				prime.add(i);
				if (i >= m)
					System.out.println(i);
			}
		}	
	}
}
