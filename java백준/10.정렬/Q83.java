import java.io.*;
import java.util.*;

class Q83
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		User[] arr = new User[n];

		StringTokenizer st;
		for (int i=0;i<n ;i++ ){
			st = new StringTokenizer(br.readLine(), " ");
			arr[i] = new User(Integer.parseInt(st.nextToken()), st.nextToken(), i);
		}

		Arrays.sort(arr, new CustomComparator() );

		for (int i=0;i<n ;i++ )
		{
			sb.append(arr[i].age).append(' ');
			sb.append(arr[i].name).append('\n');
		}
		System.out.print(sb);
	}
}

class User
{
	int age;
	String name;
	int index;

	User(int age, String name, int index){
		this.age = age;
		this.name = name;
		this.index = index;
	}
}

class CustomComparator implements Comparator<User>
{
		@Override
		public int compare(User o1, User o2){
			if (o1.age != o2.age )
				return o1.age - o2.age;
			else
				return o1.index - o2.index;
		}
}