import java.io.*;
class Person
{
	private String name;
	private int age;

	// parameterized Constructor
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	void check()
	{
		if(age <= 30) System.out.println(name + " is young");
		else if(age <=50) System.out.println(name + " is middle-aged");
		else System.out.println(name + " is old");
	}
}

class Demo
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter name: ");
		// Again declare with the same name and age as now we are in another class 
		String name = br.readLine();
		System.out.print("Enter age: ");
		int age = Integer.parseInt(br.readLine());
		Person p = new Person(name, age);
		p.check(); 
	}
}