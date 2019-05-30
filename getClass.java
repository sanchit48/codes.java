import java.lang.*;
class MyClass
{
	int x;
	MyClass(int x)
	{
		this.x = x;
	}
}

class PrintName
{
	static void show2(Object obj)
	{
		Class c = obj.getClass();
		String s = obj.getName();
		System.out.println("Classname is "+s);
	}
}

class Demo
{
	public static void main(String args[])
	{
		MyClass obj = new MyClass(10);
		PrintName.show2(obj);
	}
}
