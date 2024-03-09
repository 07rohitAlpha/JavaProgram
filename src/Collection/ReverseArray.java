package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	

	public static void main(String[] args) {
	
		Integer[]a = {5,2,4,3,1,7,8};
		// convert this Array into Java Collection List
		List<Integer>list= Arrays.asList(a);
		Collections.reverse(list);
		System.out.println(list);
	}
}
