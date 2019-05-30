class Employee implements Cloneable
{
	String name;
	int id;
	Employee(String name ,int id)
	{
		this.name = name;
		this.id = id;
	}

	void getData()
	{
		System.out.println("Name is "+name);
		System.out.println("Id is "+id);
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class Methods
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Employee obj1 = new Employee("sanchit", 19);
		obj1.getData();
		Employee obj2 = (Employee)obj1.clone();
		obj2.getData();
	}
}
