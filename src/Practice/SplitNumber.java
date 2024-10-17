package Practice;

import java.util.Scanner;

public class SplitNumber {

	public static void main(String[] args) {
		
		int num,temp ,factor=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		temp= num;
		while(temp !=0) {
			temp=temp/10;
			factor = factor*10;
		}
		System.out.println("Each digits of given number are:");
		while(factor>1) {
			factor = factor/10;
			System.out.println((num/factor)+" ");
			
			num = num % factor;
		
		
		}

	}

}
