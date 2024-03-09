package Application;
import java.util.Scanner;

public class SwapNumbers {

	
	// swap the two number using 3rd varibale.
	public static void main(String[] args) {
		int x, y, temp;
		System.out.println("enter the x and y ");
		Scanner in = new Scanner(System.in);
		
		x= in.nextInt();
		y= in.nextInt();
		
		System.out.println("Before swaping\nx = "+x+"\ny="+y);
		temp= x;
		x= y;
		y=temp;
		
		System.out.println("After Swaping\nx =" +x+"\ny=" + y);
		

	}

}
