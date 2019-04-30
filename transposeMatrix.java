import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
class Transpose
{
	public static void main(String args[]) throws IOException
{
	System.out.print("Enter rows, columns: ");
	Scanner sc = new Scanner(System.in);
	
	int rows = sc.nextInt();
	int columns = sc.nextInt();

	System.out.println("Enter elements of matrix: ");
	int arr[][] = new int[rows][columns];
	for (int i=0;i<rows;i++)
	{
		for (int j=0;j<columns;j++)
		{
			arr[i][j] = sc.nextInt();
		}
	}

	System.out.println("Your array is: ");
	for (int i=0;i<rows;i++)
	{
		for (int j=0;j<columns;j++)
		{
			System.out.print(arr[i][j] + " ");
		}
		System.out.print("\n");
	}
	
	System.out.println("Your transpose array is: ");

	for (int i=0;i<columns;i++)
	{
		for (int j=0;j<rows;j++)
		{
			System.out.print(arr[j][i] + " ");
		}
		System.out.print("\n");
	}
	
}
}