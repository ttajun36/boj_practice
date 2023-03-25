import java.util.Scanner;

class Q68 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		while (x>sum)
		{
			count++;
			sum += count;
		}
		sum -= count;
		
		if (count%2 != 0)
			System.out.printf("%d/%d\n", sum+count+1-x, x-sum);
		else
			System.out.printf("%d/%d\n", x-sum, sum+count+1-x);
	}
}
