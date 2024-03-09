package Practice;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		
		int x,y ;
		System.out.println("Enter the X and y ");
		
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y= in.nextInt();
		
		System.out.println("Before swapping =" +x+ "/y" +y);
		
		x= x+y;
		y= x-y;
		x= x-y;
		
		System.out.println("After Swapping =" +x+ "/y"+y);
		
		

	}

}
