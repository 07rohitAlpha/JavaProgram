package Application;
import java.util.Scanner;
public class SwapNumberWithVariable {
	
	
	public void main(String args[]) {
	int x =20,y=30 ;
	System.out.println("enter the x and y");
//	Scanner in = new Scanner(System.in);
	
//	x = in.nextInt();
//	y = in.nextInt();
	
	System.out.println("before swaping\nx =" +x+ "\ny" +y);
	x= x+y;
	x= x-y;
	y= x-y;
	
	System.out.println("after swaping\nx=" +x+ "\ny" +y);
	
	
	}
}
