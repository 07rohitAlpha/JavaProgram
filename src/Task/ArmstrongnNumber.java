package Task;

import java.util.Scanner;

public class ArmstrongnNumber {

	public static void main(String[] args) {
		int n, sum=0, temp,remainder,digits=0;
		Scanner in = new Scanner(System.in);
		System.out.println("input a number to check if it is armstrong numner");
		n= in.nextInt();
		temp=n;
		while(temp!=0) {
			digits++;
			temp= temp/10;
		}
		temp = n;
		while(temp!=0) {
			remainder= temp%10;
//			sum= sum+ power(remainder,digits);
			temp= temp/10;
		}
		System.out.println(n+"is an Armstrong number.");
	//	else
			System.out.println(n + "is not Armstrong number");
	}
//	static int power
		

//	}

}
