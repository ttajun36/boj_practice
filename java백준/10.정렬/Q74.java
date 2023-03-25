import java.util.Scanner;

class Q74 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int sum=0;
		for (int i=0;i<5 ;i++ ){
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		for (int i=1;i<5 ;i++ ){
			for (int j=i;j>0 ;j-- ){
				if (arr[j] < arr[j-1]){
					int value = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = value;
				}
				else
					break;
			}
		}
		
		System.out.println(sum/5);
		System.out.println(arr[2]);
	}
}
