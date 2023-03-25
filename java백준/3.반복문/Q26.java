import java.io.*;			//buffered
import java.util.*;		//stringtokenizer

class Q26 
{
	public static void main(String[] args) throws IOException		//throw ÇÊ¼ö
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int t = Integer.parseInt(bf.readLine());

		for (int i=0;i<t ;i++ )
		{
			st = new StringTokenizer(bf.readLine());

			bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
		}

		bw.flush();
		bw.close();
	}
}