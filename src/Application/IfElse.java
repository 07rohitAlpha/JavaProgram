package Application;
import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		 int marksObtained, passingMarks;
		 
		 passingMarks = 40;
		 Scanner in = new Scanner(System.in);
		 System.out.println("input mark scored by you ");
		 
		 marksObtained = in.nextInt();
		 
		 if (marksObtained >= passingMarks){
		 System.out.println("you passed the exam");
		 } 
		 
		 else {
			 System.out.println("you failed the exam");
		 }

	}

}
