package Collection;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		 int x,y,z;
		 System.out.println("Enter three integers value");
		 Scanner in = new Scanner(System.in);
		 
		 x= in.nextInt();
		 y= in.nextInt();
		 z= in.nextInt();
		 
		 
		 if (x > y && x > z)
			 System.out.println("first number is largest then the other .");
		 else if (y > x && y > z)
			 System.out.println("Second number is largest then the othe .");
		 else if (z > x && z > y)
			 System.out.println("Third numner is largest then the other.");
		 else
			 System.out.println("Entered number are not distinct.");
		 
	}

}
