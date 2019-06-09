class QueueDemo         
{
	int n;
	static void foo(int n) {
		if(n<1)
			return;
		else
			foo(n-1);
		System.out.println(n);
	}
	public static void main(String args[])
	{
		foo(3);
	}
}
