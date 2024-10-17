package Task;

import java.util.HashSet;
import java.util.Set;

public class ArrayComman {
	
   
	public static void main(String[] args) {
		int [] array1 = {1,2,3,4,5};
		int [] array2 = {4,5,6,7,8};
		
		Set<Integer> ArrayComman = findCommonElements(array1, array2);
		System.out.println("Comman elements : " + ArrayComman);
	}
	
	public static Set<Integer> findCommonElements(int[] array1,int[] array2){
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> commonset  = new HashSet<>();
		
		for(int num : array1) {
			set1.add(num);
		}
		
		for(int num : array2) {
			if(set1.contains(num)) {
				commonset.add(num);
			}
		}
		return commonset;
	}
}


