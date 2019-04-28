import java.util.Scanner;
class Differ
{
	public static void main(String args[])
{
	
	System.out.print("Enter name id salary: ");
	Scanner sc = new Scanner(System.in);
   
	String name = sc.next();
	int id = sc.nextInt();
	double sal = sc.nextDouble();

	System.out.println("Your name is " + name);
	System.out.println("Your id is " + id);
	System.out.println("Your salary is " + sal);
}
}

// import java.util.Scanner; 
// class Differ 
// { 
//      public static void main(String args[]) 
//      { 
//          Scanner scn = new Scanner(System.in); 
//          System.out.print("Enter an integer: "); 
//          int a = Integer.parseInt(scn.nextLine());     // if use int a = scn.nextInt, no chance of inputting string is there
//          System.out.print("Enter a String: "); 
//          String b = scn.nextLine(); 
//          System.out.printf("You have entered:- " + a + " " + "and name as " + b + "\n"); 
//      } 
// } 
