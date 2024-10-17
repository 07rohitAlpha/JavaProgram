package Collection;

import java.util.HashSet;
import java.util.Set;

public class CommonElementInArray {

	public static void main(String[] args) {
		
		int[] a1 = {1,2,3,2,1};
		int[] a2 = {1,2,3};
		int[] a3 = {1,2,3,4};
		
		Set<Integer>commonElements = findCommonElement(a1,a2,a3);
		System.out.println("common Element :" + commonElements);
	}
	
	public static Set<Integer> findCommonElement(int[] a1, int[] a2, int[] a3){
		Set<Integer> set1= new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> set3= new HashSet<>();
		
		for(int num: a1) {
			set1.add(num);
		}
		for(int num: a2) {
			set2.add(num);
		}
		for(int num: a3) {
			set3.add(num);
		}
		//find intersection set1 and set2
		set1.retainAll(set2);
		
		// find intersection of the result with set3
		set1.retainAll(set3);
		
		// set1  now containd common element 
		return set1;
	}

}
