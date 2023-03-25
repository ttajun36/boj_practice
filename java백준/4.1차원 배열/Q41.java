import java.util.Scanner;

class Q41 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();

		for (int i=0;i<c ;i++ )
		{
			String test = sc.next();
			int count = 0;
			int score = 0;

			for (int j=0;j<test.length() ;j++ ){
				if (test.charAt(j) == 'O'){
					count++;
					score += count;
				}
				else
					count=0;
			}

			System.out.println(score);
		}
	}
}
