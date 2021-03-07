import java.util.Scanner;

public class array_loop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the capacity of array = ");
		int n = input.nextInt();
		int[] a = new int[n];
		int i;
		
		System.out.println("Enter the elements in array = ");
		for(i=0;i<4;i++)
		{
			a[i] = input.nextInt();
		}
		
		//printing elements
		for(i=0;i<4;i++)
		{
			System.out.println(a[i]);
		}
		
		input.close();

	}
	}
