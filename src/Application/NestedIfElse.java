package Application;
import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
	  int markObtained , passingMarks;
	  char grade;
	  passingMarks= 40;
	  Scanner in = new Scanner(System.in);
	  System.out.println("input marks scoped by you");
	  
	  markObtained = in.nextInt();
	  
	  if(markObtained>= passingMarks) {
		  if(markObtained>90)
			  grade = 'A';
		  else if(markObtained >75)
			  grade = 'B';
		  else if(markObtained >60)
		  grade = 'C';
		  
		  else 
			  grade = 'D';
		  System.out.println("you passed the exam your grade is " + grade);
	  }
	  else {
		  grade = 'F';
		  System.out.println("you failed and your grade is" +grade);
	  
	}

}
}