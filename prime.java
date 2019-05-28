import java.io.*;
class Prime
{
	static boolean prime(int num)
	{
		if (num>2)
		{
			for (int i=2;i<num;i++)
			{	
				if(num%i!=0)
					continue;
				else 
					return false;
			}
			return true;
		}
		else return true;
	}

	static void generate(int num1)
	{
		int count=0;
		for(int i=2;;i++)
		{
			if (count<num1)
			{	
				boolean x = prime(i);		// can't use this.prime
				if (x == true)
				{
					System.out.println(i);
					count+=1;
				}
			}
			else break;
		}
	}

}

class Methods
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("How many primes? ");
		int num = Integer.parseInt(br.readLine());
		Prime.generate(num);
	}
}
