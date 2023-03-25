import java.util.Scanner;

class  Q60
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String word = sc.next();

		int[] ans = new int[26]; 

		for (int i=0;i<word.length() ;i++ ){
			if (word.charAt(i) < 'Z'+1)
				ans[word.charAt(i) - 'A'] ++;
			else
				ans[word.charAt(i) - 'a'] ++;
		}

		int max = -1;
		char ch = '?';

		for (int i=0;i<26 ;i++ ){
			if (max < ans[i]){
				max = ans[i];
				ch = (char)(i + 'A');
			}
			else if (max == ans[i])
				ch = '?';
		}

		System.out.println(ch);
	}
}
