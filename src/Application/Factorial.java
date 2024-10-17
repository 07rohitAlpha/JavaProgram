package Application;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
   
		int n=5  ,fact = 1;
		System.out.println("enter the integer ");
	//	Scanner in = new Scanner(System.in);
		 
	//	n= in.nextInt();
		
		if (n<0)
			System.out.println("Number should be non-negative");
		else
		{
			for(int i=1 ; i < n ; i++) 
				fact = fact*i;
					System.out.println("factorial of " +n+ "is = " +fact);
		
		
		}
	}

}
