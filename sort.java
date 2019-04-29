import java.io.*;
class Sort
{
	public static void main(String args[]) throws IOException
{
	System.out.print("how many elements? ");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int num = Integer.parseInt(br.readLine());
	int arr[] = new int[num];
	int temp;
	for (int i=0;i<num;i++)
	{
		System.out.print("Enter int: ");
		arr[i] = Integer.parseInt(br.readLine());
	}
	int i = 0;
	
	boolean flag = true;
//	boolean duck = true;
	while(flag)
    {
		
			
			if (arr[i]>arr[i+1])
			{
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				i++;
				if (i==(num-1)){
					i=0;
					continue;
				} 
				
				for(int k = 1;k<2;k++) {
					if (arr[num-k]>arr[num-k-1] && arr[num-k-1]>arr[num-k-2] && arr[num-k-2]>arr[num-k-3] && arr[num-k-3]>arr[num-k-4]) {
						flag = false;
					}

					else break;
					
				}
			}
			
		
	}
	System.out.println("The sorted array is: ");

	for (int j=0;j<num;j++)
	{
		System.out.println(arr[j]);
	}

}
}
