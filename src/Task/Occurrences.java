package Task;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Occurrences {
	
	// Function to count the number of occurrences of the word in the given string
	static int countOccurrences(String str, String word) {
		
		//Splitting the string into words
		List<String> wordslist= Arrays.asList(str.split("\\s+"));
		
		// Counting the frequency of the given word 
		return Collections.frequency(wordslist,word);
		
		
	}
	
	public static void main(String[] args) {
	
		//Input String 
		String str= "Boro";
		
		// word to be counted
		String word= "";
		
		//printing the count of occurrences of the given
		// word in the input string
		System.out.println(countOccurrences(str,word));
		

	}

}
