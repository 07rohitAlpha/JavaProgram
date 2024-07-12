package Practice;

public class Palindrome {

	public static void main(String[] args) {
		String input = "aca";
		int length= input.length();
		int i, begin=0, end=length-1, middle= (begin+end)/2;
		for(i=begin; i<=middle; i++) {
			if(input.charAt(begin)==input.charAt(end)) {
				begin++;
				end--;
			}else {
				break;
			}
		}
		if(i==middle+1) {	
			System.out.println("Palindrome");
		}else {
			System.out.println("is not Palindrome");
		}

	}

}
