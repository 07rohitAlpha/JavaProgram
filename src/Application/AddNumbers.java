package Application;
import java.util.Scanner;
public class AddNumbers {

	public static void main(String[] args) {
		
		int May,June,July,Aug,Sept,Oct,Total,trip;
		System.out.println("Enter the two integer ");
		Scanner in = new Scanner(System.in);
		
		May= in.nextInt();
		June= in.nextInt();
		July= in.nextInt();
		Aug= in.nextInt();
		Sept= in.nextInt();
		Oct= in.nextInt();
		trip= in.nextInt();
		Total=May+June+July+Aug+Sept+Oct+trip;
				
		System.out.println("Sum of entered the integer=" +Total);

	}

}
