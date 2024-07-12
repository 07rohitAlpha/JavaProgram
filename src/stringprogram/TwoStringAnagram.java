package stringprogram;

public class TwoStringAnagram {

	public static void main(String[] args) {
		
	String	string1 = "aab";
	String  string2 = "aba";
	
	System.out.println(isAnagram(string1,string2));
	}

	public static boolean isAnagram(String string1, String string2) {
		int[] count = new int[256];
		for(int i=0; i<string1.length(); i++){
			count[string1.charAt(i)]++;
			count[string2.charAt(i)]--;
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		
		return true;
	}
}