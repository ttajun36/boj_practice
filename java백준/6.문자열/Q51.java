import java.util.Scanner;
import java.util.StringTokenizer;

class Q61 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int i=0;
		
		while (st.hasMoreTokens())
		{
			st.nextToken();
			i++;
		}
		System.out.println(i);
	}
}
