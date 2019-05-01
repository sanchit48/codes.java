import java.io.*;
class Palindrome
{
	public static void main(String args[]) throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter a string: ");
	String str = br.readLine();
	String temp = str;
	// To use reverse method convert Strinf str to StringBuffer sb
	StringBuffer sb = new StringBuffer(str);
	sb.reverse();
	str = sb.toString();
	if(temp.equals(str)) {
		System.out.println(temp+" is a palindrome");
	}
	else System.out.println(temp+" is not a palindrome");
}
}
