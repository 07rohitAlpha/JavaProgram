package Application;
import java.util.Scanner;
public class AddNumbers {

	public static void main(String[] args) {
		
		int x,y,z;
		System.out.println("Enter the two integer ");
		Scanner in = new Scanner(System.in);
		
		x= in.nextInt();
		y= in.nextInt();
		z= x+y;
		System.out.println("Sum of entered the integer=" +z);

	}

}
