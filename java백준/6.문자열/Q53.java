import java.util.Scanner;

class Q63 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] ans = new int[8];

		for (int i=0;i<str.length() ;i++ )
		{
			if (str.charAt(i) < 'P')
				ans[(str.charAt(i) - 'A')/3]++;
			else if (str.charAt(i) < 'T')
				ans[5]++;
			else if (str.charAt(i) < 'W')
				ans[6]++;
			else
				ans[7]++;
		}
		
		int count = 0;
		for (int i=0;i<8 ;i++ )
			count += (i+3) * ans[i];

		System.out.println(count);
	}
}
