import java.io.*;
import java.util.*;

class Q84 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		long[] arr = new long[n];
		long[] arr2 = new long[n];
		int[] ans = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i=0;i<n ;i++ ){
			long value = Long.parseLong(st.nextToken());
			arr[i] = value;

			if (i==0)
				arr2[i] = value;
			else{
				for (int j=0;j<i ;j++ )
				{
					if (arr2[j] == value)
						break;
					if (arr2[j] > value)
					{
						for (int k=i;k>j ;k-- )
							arr2[k] = arr2[k-1];
						arr2[j] = value;
						break;
					}

					if (j == i-1)
						arr2[i] = value;
				}
			
			}
		}
		
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (arr[i] > arr2[j])
				{
					if (j>0 && arr2[j]!=arr2[j-1])
						ans[i]++;
					else if (j==0)
						ans[i]++;
				}
				else
					break;
			}
		}
		
		
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<n ;i++ )
			sb.append(ans[i]).append(' ');
		System.out.println(sb);
		
	}
}

//삽입 정렬처럼 배열 하나는 그냥 들어가고
//배열 하나는 정렬을 하면서 중복처리도 하면서 들어가기.
