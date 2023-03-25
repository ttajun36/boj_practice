/*/
import java.util.Scanner;

class Q65 
{
	static boolean func(char x, String y){
		if (y.indexOf(x) == -1)
			return true;
		else{
			int count = 0;

			for (int i=0;i<y.length() ;i++ )
			{
				if (y.charAt(i) == x){
					if (count == 0)
						count=1;
					else if (count ==1)
						if (y.charAt(i-1) != x)
							return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count=0;

		for (int i=0;i<n ;i++ )
		{
			String y = sc.next();
			int count2 = 0;
			for (char x='a';x<'z'+1 ;x++ )
			{
				if (func(x,y) == false){
					count2 = 1;
					break;
				}
			}

			if (count2 == 0)
				count++;
		}

		System.out.println(count);
	}
}
//*/

import java.util.Scanner;

class Q65
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = n;

		for (int i=0;i<n ;i++ )
		{
			String str = sc.next();
			int[] arr = new int[26];
			arr[str.charAt(0)-'a'] = 1;

			for (int j=1;j<str.length() ;j++ )
			{
				if (str.charAt(j) != str.charAt(j-1)){
					if (arr[str.charAt(j)-'a']==1){
						ans--;
						break;
					}
					else
						arr[str.charAt(j)-'a'] = 1;
				}
			}
		}

		System.out.println(ans);
	}
}