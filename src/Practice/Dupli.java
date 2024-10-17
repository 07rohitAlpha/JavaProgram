package Practice;

public class Dupli {

	public static void main(String[] args) {
		
		String s = "Executive".toLowerCase();
		char[] character = s.toCharArray();
		
		boolean isNotDuplicate = false;
		for(int i=0; i<s.length(); i++) {
			boolean isDuplicate= false;
			
		for(int j= i+1; j<s.length(); j++) {
			if(character[i] == character[j]){
				isDuplicate = true;
				break;
			}
		}
		if(isDuplicate) {
			System.out.println(character[i]);
		}
		}
		
		
	}

}
