package Task;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


//Input - s = “bca”, roll[] = {1,2,3}
//	Output- eeb
//	Explanation- roll[0] = 1 means roll first character of string that becomes ‘cca’ then
//	roll[1] = 2 means roll first two characters of string that becomes ‘dda’ then for roll[2]=
//	3 means roll first three characters of string which becomes ‘eeb’."
	
	
public class Practice {
	 public static void main(String[] args) {
	       String input = "i am learning learning java java programming ";
	      
	      String[] inputArr= input.split(" ");
	   	  Set<String> myset= new LinkedHashSet<>();
	      for(String x : inputArr){
	          myset.add(x);
	      }
	      Iterator itr= myset.iterator();
	      while(itr.hasNext()){
	          System.out.println(itr.next() + " ") ;
	      }
	      
	    }
	}
	


