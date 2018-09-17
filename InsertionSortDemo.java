import java.util.*;

public class InsertionSortDemo
{
	public static void main(String[] args)
	{
		// variables
		int[] someNums = new int[5];
		int comparisonToMake = someNums.length - 1;
		Scanner keyboard = new Scanner(System.in);
		int a, b, temp;
		
		/* a loop that prompts the user 5 times to enter a number
		numbers will become the values of the array elements */
		for(a = 0; a < someNums.length; ++a)
		{
			System.out.print("Enter number " + (a + 1) + " >> ");
			someNums[a] = keyboard.nextInt();
		}
		// call the method that accepts the full array and the number of iterations of the sort process
		display(someNums, 0);
		
		a = 1; // starts testion the second element of the array
		//insertion algorithm
		while(a < someNums.length)
		{
			temp = someNums[a];
			b = a - 1;
			while(b >= 0 && someNums[b] > temp)
			{
				someNums[b+1] = someNums[b];
				--b;
			}
			someNums[b + 1] = temp;
			display(someNums, a);
			++a;
		}
	}
	
	// defines the display() method which outputs the integers
	public static void display(int[] someNums, int a)
	{
		System.out.print("Iteration " + a + ": ");
		
		for(int x = 0; x < someNums.length; ++x)
			System.out.print(someNums[x] + " ");
		System.out.println();
	}
}