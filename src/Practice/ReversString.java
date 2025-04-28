package Practice;

import java.util.Scanner;

public class ReversString {

	public static void main(String[] args) {
//		
//		String  original , reverse = " ";
//		//Scanner in = new Scanner(System.in);
//		System.out.println("Enter revers the String : ");
//	//	original = in.nextLine();
//		int length= original.length();
//		for (int i= length-1; i>=0; i--)
//		 reverse = reverse +original.charAt(i);
//		
//		System.out.println("Reverse string is :" + reverse);
//
//	}
//		
		        String original = "Wellcome to the ".toLowerCase(); // Specify the original string directly
		        String reverse = "";
		        
		        System.out.println("Original string: " + original);
		        
		      //  String[] arr= original.split(" ");
		        int length = original.length();
		        
		        for (int i = length - 1; i >= 0; i--) {
		            reverse = reverse + original.charAt(i);
		        }
		        
		        System.out.println("Reverse string is: " + reverse);
		
		
		
		
		    }
		}




		


