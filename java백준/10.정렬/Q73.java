import java.util.Scanner;

class  Q73
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i=0;i<n ;i++ )
			arr[i] = sc.nextInt();

		if (n==1)
			System.out.println(arr[0]);
		else{
			int value;

			for (int i=1;i<n ;i++ ){
				for (int j=i;j<n ;j++ ){
					if (arr[j] < arr[i-1]){
						value = arr[i-1];
						arr[i-1] = arr[j];
						arr[j] = value;
					}
				}

				System.out.println(arr[i-1]);
			}

			System.out.println(arr[n-1]);
		}
		
	}
}
