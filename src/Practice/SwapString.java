package Practice;

public class SwapString {
	
	public static void main(String[] args) {
		
	
		String a = "Rohit";
		String b= "preethi";
		
		System.out.println("Before string swap: a= " +a+ " and b= "+b);
		
		a= a+b;
		b= a.substring(0,a.length()-b.length());
		a= a.substring(b.length());
		
		System.out.println("After String swap : a= "+a+ " and b= "+b);
		
		
		
		
		
		
		
		
		

		
	}

}
