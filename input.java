import java.lang.*;
import java.io.*;
import java.util.*;
class Sum
{
	public static void main (String args[]) throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter name, age, salary, sex: ");
	String str = br.readLine();
	StringTokenizer st = new StringTokenizer(str, ",");
	String s1 = st.nextToken();
	String s2 = st.nextToken();
	String s3 = st.nextToken();
	String s4 = st.nextToken();

	s1 = s1.trim();
	s2 = s2.trim();
	s3 = s3.trim();
	s4 = s4.trim();

	System.out.println("You entered name: " + s1);  
	System.out.println("You entered age: " + s2);
	System.out.println("You entered salary: "+ s3);
	System.out.println("You entered sex: "+ s4);

}
}
