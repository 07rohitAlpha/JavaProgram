package Task;

import java.util.HashSet;
import java.util.Set;

public class Duplic {

	public static void main(String[] args) {
		
//		int[] arr = new int[] {1,2,3,4,7,8,8,2,3};
//		System.out.println("Duplicate element in the array");
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]==arr[j])
//				System.out.println(arr[j]);
//			}
//		
//		}
		
		int[] arr = {1,2,3,2,2,2,2,7,8,8,2,3};
//		System.out.println("Duplicate element in the array");
//		for(int i=0; i<arr.length; i++) {
//			for(int j= i+1; j<arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println(arr[i]);
//				}
//					
//			}
//		}
		
		
		Set<Integer> seeminteger = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		StringBuilder result = new StringBuilder();
		
		for(int num : arr) {
			if(seeminteger.contains(num)) {
			if(!duplicate.contains(num)) {
			result.append(num);
			duplicate.add(num);
			}
		}
			else {
				seeminteger.add(num);
			}
		
	}
		System.out.println(result);
		
		
		
		
		}
	}

