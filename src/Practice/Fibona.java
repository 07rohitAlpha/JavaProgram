package Practice;

public class Fibona {
	
//	
//	static void Fibonacci(int N) {
//		int num1=0, num2=1;
//		System.out.print(num1 + " ");
//		
//		int num3= num1+num2;
//		num1= num2;
//		num2=num3;
//	}
//
//	public static void main(String args[]) {
//		int N= 10;
//		Fibonacci(N);
//	}
//	}

	
		  public static void main(String[] args) {

		    int n = 10, firstTerm = 0, secondTerm = 1;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; ++i) {
		      System.out.print(firstTerm + ", ");

		      // compute the next term
		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		    }
		  }
		}

