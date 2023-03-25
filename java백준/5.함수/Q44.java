class Q44 
{
	static int selfNumber(int a){
		int ans = a;

		while (a>0)
		{
			ans += a%10;
			a = a/10;
		}

		return ans;
	}

	public static void main(String[] args) 
	{
		int[] arr = new int[10000];

		for (int i=0;i<10000 ;i++ )
		{
			if (selfNumber(i+1)-1<10000)
				arr[selfNumber(i+1)-1] = 1;
		}

		for (int i=0;i<10000 ;i++ )
			if (arr[i] == 0)
				System.out.println(i+1);
	}
}
