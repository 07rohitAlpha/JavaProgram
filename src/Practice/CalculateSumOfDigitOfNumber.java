package Practice;

public class CalculateSumOfDigitOfNumber {

	public static void main(String[] args) {
		int number = 12345;
		int sumOfDigits = calculateSumOfDigits(number);
		System.out.println("Sum of digit of " + number + "is : " + sumOfDigits);
	}
	public static int calculateSumOfDigits(int number) {
		
		int sum = 0;
		while (number>0) {
			int digit = number % 10;
			sum = sum + digit;
			number = number /10;
		}
		return sum;
	}

}
