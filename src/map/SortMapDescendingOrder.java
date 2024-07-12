package map;
import java.util.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class SortMapDescendingOrder {

	public static void main(String[] args) {
		// Sample map in unsorted value
		Map<String,Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("apple", 2);
		unsortedMap.put("banana", 1);
		unsortedMap.put("mango", 4);
		unsortedMap.put("cherry", 3);
		
		// descending order
		LinkedHashMap<String, Integer> sortedMap = unsortedMap.entrySet()
				.stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(
			        Map.Entry::getKey,
			        Map.Entry::getValue,
			        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
				
						
		
		// ascending order
//		LinkedHashMap<String,Integer> sortedMap= unsortedMap.entrySet()
//				.stream().sorted(Map.Entry.comparingByValue())
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
//						(oldValue,newValue) -> oldValue, LinkedHashMap::new));
		System.out.println(sortedMap);
//		
		
		
		
	}
	
}
