package map;

public class RotateLastCharacter {

	public static void main(String[] args) {
		
		String input = "Rohit";
		
		String output= rotateLastCharacterToBeginning(input);
		System.out.println(output);

	}

//	public  static String rotateLastCharacterToBeginning(String input) {
//		if(input == null || input.isEmpty()) {
//		return input;
//		}
//		
//		char[] charArray = input.toCharArray();
//		char lastchar= charArray[charArray.length-1];
//		
//		for(int i= charArray.length-1; i>0; i--) {
//			charArray[i]= charArray[i-1];
//		}
//		charArray[0] = lastchar;
//		return new String(charArray);
//		
//	}
	
	public static String rotateLastCharacterToBeginning(String input) {
	    if (input == null || input.isEmpty()) {
	        return input;
	    }
	    String result = "";
	    result += input.charAt(input.length() - 1);
	    for (int i = 0; i < input.length() - 1; i++) {
	        result += input.charAt(i);
	    }
	    return result;
	}

}
