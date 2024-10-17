package Task;

public class StringCount {
	public static void main(String[] args) {
		
		String input = "hacker rank earth";
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) != ' ') {
				count ++;
			}
		}
		System.out.println(count);
	}

	
	
	
}
