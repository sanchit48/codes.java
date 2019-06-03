import java.io.*;
class Fibonacci
{
	static int fibo(int num)
	{
		if(num<1)
		{
			System.out.println("Error");
			return 0;
		}
		else if(num==1 || num==2)
			return (num-1);
		else
			return (fibo(num-1)+fibo(num-2));
	}
	public static void main (String args[]) throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter position  ");
	int num = Integer.parseInt(br.readLine());
	int x = fibo(num);
	System.out.println(x);
}
}