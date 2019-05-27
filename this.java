class Test
{
	private int x;
	// default constructor
	Test()
	{
		this(45);           // calling para constructor
		this.display();		// calling dsiplay method
	}
	// para constructor
	Test(int x)
	{
		this.x = x;
	}

	void display()
	{
		System.out.println(x);
	}
}
class Methods
{
	public static void main(String args[])
	{
		Test obj = new Test();
	}
}