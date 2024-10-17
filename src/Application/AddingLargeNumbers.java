package Application;
import java.util.Scanner;
import java.math.BigInteger;
public class AddingLargeNumbers {

	public static void main(String[] args) {
		String number1,number2;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first integer");
		number1 = in.nextLine();
		
		System.out.println("Enter the Second integer");
		number2 = in.nextLine();
		
		BigInteger first = new BigInteger(number1);
		BigInteger second = new BigInteger(number2);
		BigInteger sum;
		
		sum = first.add(second);
		System.out.println("Result of adding =" +sum);
		

	}

}
