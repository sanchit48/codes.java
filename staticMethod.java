class Sample
{
	// declaring method as static
	static double sum(double num1, double num2)
	{
		double res = num1+num2;
		return res;
	}
	
}
class Methods
{
	public static void main(String args[])
	{
		// calling the static method with Classname.methodname
		double result = Sample.sum(56.8, 98.7);
		System.out.println("The sum is "+ result);
	}
}