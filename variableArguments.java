class Vargs
{
	static int max(int ... x)
	{
		int max = x[0];
		for(int i=0;i<x.length;i++)
		{
			if(max<x[i])
				max = x[i];
		}
		return max;
	}
}

class Methods
{
	public static void main(String args[])
	{
		int arr[] = {23,32,12,930};
	//	int max = max
		System.out.println("Maximum no. is " + Vargs.max(arr));
	}
}
