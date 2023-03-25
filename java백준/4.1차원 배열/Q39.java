/*/
import java.util.Scanner;

class Q39 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] ans = new int[42];
		int count = 0;

		for (int i=0;i<10 ;i++ ){
			ans[sc.nextInt()%42] = 1;
		}

		for (int i=0;i<42 ;i++ )
			if (ans[i] == 1)
				count++;
		
		System.out.println(count);
	}
}
//*/

import java.util.Scanner;
import java.util.HashSet;

class Q39 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();

		for (int i=0;i<10 ;i++ )
			h.add(sc.nextInt()%42);
		
		System.out.println(h.size());
	}
}