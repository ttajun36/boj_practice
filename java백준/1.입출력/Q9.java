import java.util.Scanner;

class  Q9
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int king = in.nextInt();
		int q = in.nextInt();
		int l = in.nextInt();
		int b = in.nextInt();
		int k = in.nextInt();
		int p = in.nextInt();

		System.out.printf("%d %d %d %d %d %d", 1-king, 1-q, 2-l, 2-b, 2-k, 8-p);
	}
}
