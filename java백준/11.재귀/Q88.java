import java.io.*;
import java.util.*;

class Q88 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i=0;i<n ;i++ )
			arr[i] = Integer.parseInt(st.nextToken());
		
		merge_sort(arr, 0, n-1, k);

		if (k > count)
			System.out.println(-1);

	}

	static void merge_sort(int[] a , int p, int r, int k){
		if (p<r)
		{
			int q = (p+r)/2;
			merge_sort(a, p, q, k);
			merge_sort(a, q+1, r, k);
			merge(a, p, q, r, k);
		}
	}

	static void merge(int[] a, int p, int q, int r, int l){
		int i = p;
		int j = q+1;
		int t = 0;
		int[] tmp = new int[r-p+1];

		while (i<=q && j<=r){
			if (a[i] <= a[j])
				tmp[t++] = a[i++];
			else
				tmp[t++] = a[j++];
		}

		while (i<=q)
			tmp[t++] = a[i++];
		while (j<=r)
			tmp[t++] = a[j++];

		for (int k=0;k<r-p+1 ;k++ ){
			a[k+p] = tmp[k];
			count++;
			if (l == count)
				System.out.println(tmp[k]);
		}
	}

	static int count=0;
}
