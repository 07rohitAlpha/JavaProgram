package Practice;
import java.util.*;
public class TestCollection {

	public static void main(String[] args) {
		//  Creating the hashSet and add  element
		HashSet<String> set= new HashSet<String>();
			set.add("Rohit");
			set.add("Ravi");
			set.add("Raman");
			set.add("Rahul");
			
			Iterator <String> itr = set.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
				
			}
			
			
		
 
	}

}
