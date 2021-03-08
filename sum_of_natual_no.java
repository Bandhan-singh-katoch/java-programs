import java.util.Scanner;

public class sum_of_natual_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0,i,num;
		Scanner input = new Scanner(System.in);
		System.out.print("ENter the number = ");
	    num = input.nextInt();
		
		for(i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.print("SUm = "+sum);
	}

}
