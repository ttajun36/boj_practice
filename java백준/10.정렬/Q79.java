import java.io.*;

class Q79 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();

		int[] arr = new int[10];
		while (n>0)
		{
			arr[n%10]++;
			n/=10;
		}

		for (int i=9;i>=0 ;i-- )
			for (int j=0;j<arr[i] ;j++ )
				sb.append(i);

		System.out.println(sb);
	}
}
