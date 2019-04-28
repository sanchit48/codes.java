import java.lang.*;
import java.io.*;
import java.util.*;
class Year
{
	public static void main (String args[]) throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter year no:  ");
	int year = Integer.parseInt(br.readLine());
    
	// Deploying algorithm
	if (year % 100 == 0 && year % 400 == 0) 
	    System.out.println(year + " is a leap year");
	
	else if (year % 100 != 0 && year % 4 == 0) 
	    System.out.println("Leap year");

	else System.out.println("Not Leap year");
}
}
