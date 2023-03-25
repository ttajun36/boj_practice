import java.util.Scanner;

class Q71 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int max = -1;
		int row = 0;
		int column = 0;
		
		for (int i=0;i<9 ;i++ )
			for (int j=0;j<9 ;j++ ){
				int value = sc.nextInt();
				if (max < value ){
					max = value;
					row = i+1;
					column = j+1;
				}
			}
		
		System.out.println(max);
		System.out.printf("%d %d\n", row, column);
	}
}
