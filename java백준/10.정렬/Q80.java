import java.io.*;
import java.util.*;


class Q80 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		int[][] arr = new int[n][2];

		for (int i=0;i<n ;i++ ){
			st = new StringTokenizer(bf.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		/*
		for (int i=0;i<n-1 ;i++ ){
			for (int j=i+1;j<n ;j++ ){
				if (arr[j-1][0] > arr[j][0]){
					int value1 = arr[j-1][0];
					arr[j-1][0] = arr[j][0];
					arr[j][0] = value1;

					int value2 = arr[j-1][1];
					arr[j-1][1] = arr[j][1];
					arr[j][1] = value2;
				}
			}
		}

		for (int i=0;i<n-1 ;i++ ){
			for (int j=i+1;j<n ;j++ ){
				if (arr[j-1][0] == arr[j][0] && arr[j-1][1] > arr[j][1]){
					int value1 = arr[j-1][0];
					arr[j-1][0] = arr[j][0];
					arr[j][0] = value1;

					int value2 = arr[j-1][1];
					arr[j-1][1] = arr[j][1];
					arr[j][1] = value2;
				}
			}
		}
		*/

		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}
				else {
					return o1[0] - o2[0];
				}
			}
		});	
		

		for (int i=0;i<n ;i++ ){
			sb.append(arr[i][0]).append(' ');
			sb.append(arr[i][1]).append('\n');
		}

		System.out.println(sb);
	}
}
