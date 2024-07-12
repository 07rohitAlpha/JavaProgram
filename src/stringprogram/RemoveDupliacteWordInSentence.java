package stringprogram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupliacteWordInSentence {

	public static void main(String[] args) {
		String input = "i am rohit rohit";
		// inbuild method use 
	//	String result = Arrays.stream(input.split(" ")).distinct().collect(Collectors.joining(" "));
	//	System.out.println(result);
		
		String[] inputArr= input.split(" ");
		Set<String> mySet= new LinkedHashSet<String>();
		for(String x: inputArr) {
			mySet.add(x);
		}
		Iterator itr = mySet.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}

}
