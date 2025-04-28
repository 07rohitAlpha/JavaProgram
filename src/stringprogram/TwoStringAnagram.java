package stringprogram;

import java.util.Arrays;

public class TwoStringAnagram {

	public static void main(String[] args) {
		
	String	string1 = "listen";
	String  string2 = "silent";
//	
//	System.out.println(isAnagram(string1,string2));
//	}
//
//	public static boolean isAnagram(String string1, String string2) {
//		int[] count = new int[256];
//		for(int i=0; i<string1.length(); i++){
//			count[string1.charAt(i)]++;
//			count[string2.charAt(i)]--;
//		}
//		
//		for(int i=0; i<count.length; i++) {
//			if(count[i]!=0) {
//				return false;
//			}
//		}
//		
//		return true;
		
	// second method	
		
		string1= string1.toLowerCase();
		string2= string2.toLowerCase();
		
		// check the length is same 
		if(string1.length()==string2.length()) {
			
			//convert the string to char Array
			
			char[] charArray1=string1.toCharArray();
			char[] charArray2= string2.toCharArray();
			
			// sort the char array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			// sorted char array are same 
			//then string is anagram
			
			boolean result = Arrays.equals(charArray1, charArray2);
			if(result) {
				System.out.println(string1 + " and " + string2 + " are Anagarm" );
			}else {
				System.out.println(string1 + " and " + string2 + " are not Anagram");
			}
			
		}
		
		
	}
}


