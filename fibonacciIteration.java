import java.lang.*;
import java.io.*;
import java.util.*;
class Fibonacci
{
	public static void main (String args[]) throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("How many fibonacci: ");
	int num = Integer.parseInt(br.readLine());
	int f1 = 0;
	int f2 = 1;
	int f;
	int i = 0;
	System.out.println(f1+"\n"+f2);
    
	// Deploying algorithm
	while (i < num)
	{
		f = f1+f2;
        System.out.println(f);
		f1 = f2;
		f2 = f;
		i++;
	}
}
}
