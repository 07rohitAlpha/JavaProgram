package Application;
import java.util.Scanner;
public class GetInputFormUser {

	public static void main(String[] args) {
		
		int a;
		float b;
		String s;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		s = in.nextLine();
		System.out.println("you entered the String "+s);
		
		System.out.println("Enter the integer ");
		a = in.nextInt();
		System.out.println("you entered the integer "+a);
		
		System.out.println("Enter the float");
		b = in.nextFloat();
		System.out.println("you entered the float" +b);
		
		

	}

}
