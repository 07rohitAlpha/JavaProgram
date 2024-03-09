package Practice;

public class revers {

	public static void main(String[] args) {
		 String s = "Rohit Kumar Academy";
		 String [] splittedString = s.split("Kumar");
		 System.out.println(splittedString[0]);
		 System.out.println(splittedString[1]);
		// System.out.println(splittedString[2]);
		 System.out.println(splittedString[0].trim()); 
		 
		 
		 for(int i=0;i<s.length(); i++){
			 System.out.println(s.charAt(i));
		 }
		 
		 System.out.println("========================");
		 
		 for(int i =s.length()-1; i>=0; i--) {
			 System.out.println(s.charAt(i));
		 }

	}

}
