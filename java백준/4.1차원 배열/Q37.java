/*/
import java.util.Scanner;

class Q37 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];

		arr[0] = sc.nextInt();
		int count = 0;

		for (int i=1;i<9 ;i++ ){
			arr[i] = sc.nextInt();

			if (arr[0] < arr[i]){
				arr[0] = arr[i];
				count = i;
			}
		}

		System.out.println(arr[0]);
		System.out.println(count+1);
	}
}
//*/

import java.util.Scanner;

class Q37 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int value;
		int count = 0;

		for (int i=1;i<9 ;i++ ){
			value = sc.nextInt();

			if (max < value){
				max = value;
				count = i;
			}
		}

		System.out.println(max);
		System.out.println(count+1);
	}
}