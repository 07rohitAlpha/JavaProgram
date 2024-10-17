package stringprogram;

public class EvenLengthwordsString {

	public static void main(String[] args) {
		String str1="hell World we lol";
		for(String s: str1.split(" ")) {
			if(s.length()%2!=0) {
				System.out.println(s);
			}
		}

	}

}
