import java.io.*;
class Marks
{
	public static void main(String args[]) throws IOException
{
	System.out.print("How many subjects? ");
	// Making object for input
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int num = Integer.parseInt(br.readLine());
	// Alloting memory for marks array(important)
	int marks[] = new int[num];
	int sum = 0;
	double percentage; 
	for (int i=0;i<num;i++) {
		System.out.print("Enter marks: ");
		marks[i] = Integer.parseInt(br.readLine());
	}	

	for (int i=0;i<num;i++) {
		sum+=marks[i];
	}
	// Converting int sum to float, type casting
	percentage = (float)sum/num;

	System.out.println("Total marks = " + sum);
	System.out.println("Percentage = " + percentage);

}
}
