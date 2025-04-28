package Practice;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
	
	//	Scanner in = new Scanner(System.in);
	//	System.out.println("Please enter the Value");
		
		int num = 5, a=0 , b=0, c=1;
	//	num= in.nextInt();
		System.out.println("Fibonacci Series of the number is:");
		for(int i =0; i<num; i++ ) {
			a=b;
			b=c;
			c= a+b;
			System.out.println("series :"  +a);
			
		
		
			
			
		}
		
		
		
	}
}

	