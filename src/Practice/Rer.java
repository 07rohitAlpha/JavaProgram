package Practice;
import java.util.Scanner;
public class Rer {

	public static void main(String[] args) {
		String original, reverse = "";
		
		Scanner in = new Scanner(System.in);
		System.out.println("please enter the string");
		original = in.nextLine();
		 int length = original.length();
		 
		 for(int i = length-1; i >=0; i--) {
			reverse+=original.charAt(i);			
		 }
		System.out.println("enter the String : " +reverse);
		

	}

}
