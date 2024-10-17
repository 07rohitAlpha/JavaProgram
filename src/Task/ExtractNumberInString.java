package Task;

public class ExtractNumberInString {

	public static void main(String[] args) {
		String input = "Ro1h2i4t5";
		String number = "";
		String letter = "";
		for(int i =0; i<input.length(); i++) {
			char c = input.charAt(i);
			if(c>= '0' && c<= '9') {
				number += c;
			}
			if(Character.isLetter(c)) {
				letter += c;
			}
		}
		System.out.println("Extracted number : " + number + " = " + letter);

	}

}
