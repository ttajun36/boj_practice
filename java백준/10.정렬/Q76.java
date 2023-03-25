import java.util.Scanner;

class Q76 
{

	static void merge(int[] arr, int start, int end){
		if (start == end)
			return;
		else{
			merge(arr, start, (start+end)/2);
			merge(arr, (start+end)/2+1, end);
			
			int[] newArr = new int[end-start+1];
			int count=0;
			int a = start;
			int b = (start+end)/2+1;
			while (a<(start+end)/2+1 && b<end+1)
			{
				if (arr[a] < arr[b]){
					newArr[count] = arr[a];
					count++;
					a++;
				}
				else{
					newArr[count] = arr[b];
					count++;
					b++;
				}
			}

			if (b == end+1){
				for (int i=count;i<end-start+1; i++){
					newArr[i] = arr[a];
					a++;
				}
			}
			else{
				for (int i=count;i<end-start+1; i++ ){
					newArr[i] = arr[b];
					b++;
				}
			}

			for (int i=0;i<end-start+1 ;i++ )
				arr[i+start] = newArr[i];
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n ;i++ )
			arr[i] = sc.nextInt();

		merge(arr, 0, n-1);

		for (int i=0;i<n ;i++ )
			sb.append(arr[i]).append('\n');
		
		System.out.println(sb);
	}
}
