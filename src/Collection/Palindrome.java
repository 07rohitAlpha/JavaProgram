package Collection;

import java.util.Scanner;

//public class Palindrome {
//
//	public static void main(String[] args) {
//		String original, revers = "";
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("Enter a string to check if is a palindrome");
//		original = in.nextLine();
//		
//		int length = original.length();
//		 for (int i = length-1; i>=0; i--)
//			 revers= revers + original.charAt(i);
//		 
//		 if (original.equals(revers))
//			 System.out.println("Enter string is a palindrome.");
//
//		 else
//			 System.out.println("Enter string is not a palindrome.");
//		 
//	}
//
//}




//=============================================================================//
public class Palindrome {

	public static void main(String[] args) {   
		
		String inputString;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input a string");
		inputString = in.nextLine();
		
		int length = inputString.length();
	//	int i, begin, end, middle;
		
	int i,	begin = 0,end = length-1,middle = (begin + end)/2;
		
		
		for (i= begin; i<=middle; i++) {
			if(inputString.charAt(begin) == inputString.charAt(end)) {
				begin++;
				end--;
			}
			else {
				break;
			}
		}
		
		if (i == middle +1) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		}




	}




