package Collection;

import java.util.Arrays;
import java.util.Scanner;

public class ReceiveInput {

	public static void main(String[] args) {
		
    // Code for in taking the site of Array from the User
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array:"); //s
		int size = scanner.nextInt();
		
		// Create an Array
		int[] ar = new int[size];
		
		// Code for in taking the Array element from the user based on the earlier provided size
		
		for (int i=0; i<size; i++) {
			 System.out.println("Enter number");
			 ar[i] = scanner.nextInt();
		}
		scanner.close();
		// print the Array here
		System.out.println(Arrays.toString(ar));
    
				
			}
		
		
	}


