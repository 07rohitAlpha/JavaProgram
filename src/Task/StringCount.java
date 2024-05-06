package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringCount {

	public static void main(String[] args) {
		
		String a= "String";
		int Count= 0;
		
		for(int i = 0;i<a.length(); i++) {
			if(a.charAt(i) != ' ') {
				Count ++;
			}
		}
		System.out.println(Count);

	}

}




	
	
	
	
	

