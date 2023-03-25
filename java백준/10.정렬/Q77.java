/*/ heapsort
import java.io.*;

class Q77 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		ArrayHeap ah = new ArrayHeap(n+1);
		for (int i=0;i<n ;i++ )
			ah.put(Integer.parseInt(br.readLine()));
		
		for (int i=0;i<n ;i++ )
			sb.append(ah.delete()).append('\n');
		
		System.out.println(sb);
	}
}


class ArrayHeap
{
	int parent;
	int size;
	int[] heap;

	ArrayHeap(int size){
		this.size = size;
		this.heap = new int[size];
	}

	void put(int a){
		heap[++heap[0]] = a;
		int p = heap[0];

		while (p>1 && heap[p/2] > heap[p])
		{
			int value = heap[p/2];
			heap[p/2] = heap[p];
			heap[p] = value;
			p /=2;
		}
	}

	int delete(){
		int min = heap[1];
		
		heap[1] = heap[heap[0]];
		int p = 1;
		while (p*2<heap[0])
		{
			if (heap[2*p] < heap[2*p+1]){
				if (heap[p] <= heap [2*p])
					break;
				else{
					int value = heap[p];
					heap[p] = heap[2*p];
					heap[2*p] = value;

					p = 2*p;
				}
			}
			else{
				if (heap[p] <= heap [2*p+1])
					break;
				else{
					int value = heap[p];
					heap[p] = heap[2*p+1];
					heap[2*p+1] = value;

					p = 2*p+1;
				}
			}
		}

		return min;
	}
}
//*/

import java.io.*;

class Q77 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		int[] count = new int[10001];
		for (int i=0;i<n ;i++ )
			count[Integer.parseInt(br.readLine())]++;
		
		for (int i=0;i<10001 ;i++ )
			for (int j=0;j<count[i] ;j++ )
				sb.append(i).append('\n');
		
		System.out.println(sb);
	}
}