package Task;

public class Duplicate_Char {

	public static void main(String[] args) {
		
		String s = "hackerearth".toLowerCase();
		char[] character = s.toCharArray();
		
		boolean isNotDuplicate = false;
		
		for (int i=0; i<s.length(); i++) {
			boolean isDuplicate = false;
			
			for (int j= i+1;j<s.length(); j++) {
				if (character[i] == character[j]){
					isDuplicate = true;
					break;
				}
				
			}
			
			if (isDuplicate) {
				System.out.println(character[i]);
				isDuplicate= true;
			}
		}
//		if(!isNotDuplicate) {
//			System.out.println("No duplicate are found");
//		}
		
		
		
		
		
		
//		String s = "hackerrankearth".toLowerCase();
//		char[] character = s.toCharArray();
//		
//		boolean isNotDuplicat = false;
//		for(int i =0; i<s.length(); i++) {
//			boolean isDuplicate = false;
//			
//			for(int j = 0; j<s.length(); j++) {
//				if(character[i]== character[j]) {
//					isDuplicate = true;
//					break;
//				}
//			}
//			if(isDuplicate) {
//				System.out.println(character[i]);
//				isDuplicate = true;
//			}
//		}
		
		
		
			
		

	}

}
