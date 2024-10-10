package stringprogram;

public class VowelCounter {

	public static void main(String[] args) {
		String input = "Hello World!";
	//	int vowelCount = countVowels(input);
		System.out.println("Number of vowels in the string " + vowelCount(input));
	}
	
	public static int vowelCount(String str) {
		int count = 0 ;
		String vowels = "aeiouAEIOU";
		
		for(int i =0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(vowels.indexOf(c) != -1) {
				count++;
			}
		}
		return count;
	}

}
