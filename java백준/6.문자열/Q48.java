import java.util.Scanner;

class  Q58
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		for (int i=0;i<'z'-'a'+1 ;i++ ){
			System.out.print(word.indexOf((char)(i+97)) +" ");
		}
	}
}
