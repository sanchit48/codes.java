import java.io.*;
class BubbleSort
{	
		void bubbleSort(int arr[])
		{
			boolean flag = true;
			while(flag == true)
			{
				flag = false;
				for(int i=0;i<arr.length-1;i++)
				{
					if(arr[i] > arr[i+1])
					{
						int temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
						flag = true;
					}
				}
				
				if(flag == false)
					break;
			}
		}
	
		void printArray(int arr[])
		{
			System.out.println("Sorted array: ");
			for(int i=0;i<arr.length;i++)
				System.out.println(arr[i]+" ");
		}
	
	public static void main(String args[]) throws IOException
	{		
		BubbleSort bs = new BubbleSort();
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("How many elements: ");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter element: ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		bs.bubbleSort(arr);
		bs.printArray(arr);
	}
}
