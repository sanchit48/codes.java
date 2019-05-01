import java.io.*;
class FindString
{
	public static void main(String args[]) throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("How many strings? ");
	int n = Integer.parseInt(br.readLine());
	String str[] = new String[n];
	for (int i=0;i<n;i++)
	{
		System.out.print("Enter a string: ");
		str[i] = br.readLine();
	}

	System.out.print("Enter string to search: ");
	String search = br.readLine();

	for (int i=0;i<n;i++)
	{
		if(search.equalsIgnoreCase(str[i]))
		{
			System.out.println("Found at position "+ (i+1));
		}
	}
}
}
