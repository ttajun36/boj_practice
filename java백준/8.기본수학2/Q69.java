import java.util.Scanner;

class Q69 
{
	static void isPrime(boolean[] prime, int i){
		if (i == 1)
			prime[i] = true;
		else if (i>1)
		{
			for (int j=1;j <= Math.sqrt(i+1) ;j++ ){
				if (prime[j])
					if ((i+1)%(j+1) == 0){
						prime[i] = false;
						return;
					}
				
			}
			prime[i] = true;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		int[] testCase = new int[t];

		int max = 0;
		for (int i=0;i<t ;i++ ){
			int value = sc.nextInt();
			testCase[i] = value;
			if (max< value)
				max = value;
		}
		sc.close();

		boolean[] prime = new boolean[max];
		for (int i=0;i<max ;i++ ){
			isPrime(prime, i);
		}

		for (int i=0;i<t ;i++ )
		{
			int ans1 = 0;
			int ans2 = 0;

			for (int j=0;j<testCase[i]/2 ;j++ )
				if (prime[j] && prime[testCase[i]-2-j]){
					ans1 = j+1;
					ans2 = testCase[i]-1-j;
				}
			
			System.out.printf("%d %d\n", ans1, ans2);
		}
	}
}
