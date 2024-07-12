package Task;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Char {

	public static void main(String[] args) {

//		String s = "hackerearth".toLowerCase();
//		char[] character = s.toCharArray();
//		
//		boolean isNotDuplicate = false;
//		
//		for (int i=0; i<s.length(); i++) {
//			boolean isDuplicate = false;
//			
//			for (int j= i+1;j<s.length(); j++) {
//				if (character[i] == character[j]){
//					isDuplicate = true;
//					break;
//				}	
//		}if (isDuplicate) {
//				System.out.println(character[i]);
//				isDuplicate= true;
//			}
//		}
//		if(!isNotDuplicate) {
//			System.out.println("No duplicate are found");
//		}

//		String s = "Hackerrank".toLowerCase();
//		int count= 0;
//		char[] chr = s.toCharArray();
//		boolean isNotDupliacte = false;
//		for(int i=0; i<s.length(); i++) {
//			for(int j= i+1; j<s.length();j++) {
//				if(chr[i]==chr[j]) {
//					System.out.println(chr[j]);
//					count++;
//					break;
//				}
//			}
//		}

//		String s= "hackerrankkk";
//		int count=0;
//		char[] ch = s.toCharArray();
//		for(int i =0; i<s.length(); i++) {
//			for(int j= i+1; j<s.length(); j++) {
//				if(ch[i]==ch[j]) {
//					System.out.println(ch[j]);
//					count++;
//					break;
//				}
//			}
//		}
//		
//		

		String s = "hacakkaerrkkk".toLowerCase();
		char[] character = s.toCharArray();

		Set<Character> duplicates = new HashSet<>();
		Set<Character> seenCharacters = new HashSet<>();
		StringBuilder result = new StringBuilder();

		for (char c : character) {
			if (seenCharacters.contains(c)) {
				if (!duplicates.contains(c)) {
					result.append(c);
					duplicates.add(c);
				}
			} else {
				seenCharacters.add(c);
			}
		}
		System.out.println("duplicate character :" + result.toString());

	}

}
