import java.util.Scanner;
import java.util.Arrays;

class Q38 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] student = new int[30];
		

		for (int i=0;i<28 ;i++ )
		{
			int value = sc.nextInt();
			student[value-1] = 1;
		}

		for (int i=0;i<30 ;i++ )
			if (student[i] == 0)
				System.out.println(i+1);
	}
}
