import java.io.*;
import java.util.Scanner;
class Matrix
{
	int r,c;
	String s;							// can't do "= new int[r][c]" as r,c has no values yet
	int arr[][];
	Scanner sc = new Scanner(System.in);
	Matrix(int r, int c)
	{
		this.r = r;
		this.c = c;
		arr = new int[r][c];
	}

	int[][] getMatrix()
	{
		System.out.println("Enter elements for first matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				arr[i][j] = sc.nextInt();
		}
		System.out.println();
		return arr;						// not arr[][]
	}

	int[][] findSum(int a[][], int b[][])
	{
		int[][] temp = new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				temp[i][j] = a[i][j]+b[i][j];
		}
		return temp;
	}

	void displayMatrix(int temp[][])
	{
		System.out.println("The sum matrix is:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				System.out.print(temp[i][j]+" ");
			
			System.out.println();
		}
	}
}

class Methods
{
	public static void main(String args[]) throws IOException
	{
		Matrix obj1 = new Matrix(3,3);
		Matrix obj2 = new Matrix(3,3);
		int x[][] = obj1.getMatrix();
		int y[][] = obj2.getMatrix();
		int z[][] = obj1.findSum(x,y);
		obj1.displayMatrix(z);
	}
}