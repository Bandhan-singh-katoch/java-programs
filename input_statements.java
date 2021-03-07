import java.util.Scanner;

public class input_statements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer = ");
		int a = input.nextInt();
		System.out.println("Entered integer is = "+a);

		System.out.print("Enter the decimal number = ");
		float b = input.nextFloat();
		System.out.print("Entered decimal number is = "+b);
		
		input.close();
	}

}
