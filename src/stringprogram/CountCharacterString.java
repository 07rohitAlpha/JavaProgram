package stringprogram;

public class CountCharacterString {

	public static void main(String[] args) {
		String str =  "java is object oriented language";
		int result = str.length()-str.replaceAll("e", "").length();
		System.err.println(result);
		
		
		
	}
}
