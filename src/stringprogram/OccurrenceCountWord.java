package stringprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OccurrenceCountWord {

	public static void main(String[] args) {
		String str = "i am learning learning java java programming ";
//		Map<String,Integer> map = new HashMap<String,Integer>();
//		Integer count = 1;
//		String[] arr = str.split(" ");
//		for(int i =0; i<arr.length; i++) {
//			if(!map.containsKey(arr[i])) {
//				map.put(arr[i], count);
//			}else {
//			map.put(arr[i], map.get(arr[i])+1);
//		}
//	}
//		for(String x: map.keySet()) {
//			System.out.println("The count of word :" + x+ "=" + map.get(x));
//		}
		Map<String,Integer> map = new HashMap<String,Integer>();
		Integer count = 1;
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		
		
		
		for(Map.Entry<String, Integer> e: map.entrySet()) {
			
				
				System.out.println("The Count of Word :" + e.getKey().toString().toUpperCase()+ " = " + e.getValue() );
			}
		
//		for(String x: map.keySet()) {
//			if()
//			System.out.println("The count of word :" + x + "=" + map.get(x));
//		}
		
}

}
