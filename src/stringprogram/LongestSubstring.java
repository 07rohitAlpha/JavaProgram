package stringprogram;

import java.util.HashSet;

public class LongestSubstring {

	public static void main(String[] args) {
		String  input = "abcabcbb";
		System.out.println("Longest Substring length : " + lengthOfLongestSubstring(input));
	}
	
//	public static int lengthOfLongestSubstring(String input){
//		int maxLength =0;
//		for(int start =0; start<input.length(); start ++) {
//			boolean[] seen = new boolean[256];
//			int length = 0;
//			for(int end = start; end<input.length(); end ++) {
//				if(seen[input.charAt(end)]) {
//					break;
//				}
//				seen[input.charAt(end)] = true;
//				length++;
//			}
//			if(length > maxLength) {
//				maxLength = length;
//			}
//		}
//		return maxLength;
//}	
	
	
// Second Method : 
	
	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> set = new HashSet<>();
		
		int maxLength = 0;
		int left =0;
		
		for(int right=0; right<s.length(); right++) {
			while(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left ++;
			}
		     set.add(s.charAt(right));
		     maxLength = Math.max(maxLength, right - left +1);
		}
		return maxLength;
	
//		String s1 = "abcabcbb";
//		String s2= "bbbbb";
//	
//		System.out.println("Longest substring without repeating character in s1 : " + lengthOfLongestSubstring(s1));
//		System.out.println("Longest substring without repeating character in s2 : " + lengthOfLongestSubstring(s2));	
//	}
//	
//	public static int lengthOfLongestSubstring(String s) {
//		HashSet<Character> set = new HashSet<Character>();
//		int maxLength = 0;
//		 int start = 0;
//		  int end = 0;
//		  
//		  while(end<s.length()) {
//			  char currentChar = s.charAt(end);
//			  if(!set.contains(currentChar)) {
//				  set.add(currentChar);
//				  maxLength = Math.max(maxLength, end - start+1);
//				  end++;
//			  }else {
//				  set.remove(s.charAt(start));
//				  start++;
//			  }
//		  }
//		  return maxLength;
		
		
		
		
		
	}

}
