import java.util.Scanner;

class Q87 
{
	static int count;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i=0;i<t ;i++ )
		{
			System.out.print(isPalindrome(sc.next()));
			System.out.print(' ');
			System.out.println(count);
		}
	}

	static int isPalindrome(String s){
		count=0;
		return recursion(s, 0, s.length()-1);
	}
	
	static int recursion(String s, int l, int r){
		count++;

		if (l>=r)
			return 1;
		else if (s.charAt(l) != s.charAt(r))
			return 0;
		else
			return recursion(s, l+1, r-1);
	}
}
