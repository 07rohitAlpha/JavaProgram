package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Occ {

	
//	    public static void main(String[] args)
//	    {
//	        String str = "Boro";
//	        ArrayList<Character> al = new ArrayList<>();
//	        for (int i = 0; i < str.length(); i++) {
//	            al.add(str.charAt(i));
//	        }
//	        HashMap<Character, Integer> hm = new HashMap<>();
//	        for (int i = 0; i < str.length(); i++) {
//	            hm.putIfAbsent(al.get(i),
//	                           Collections.frequency(al,al.get(i)));
//	        }
//	 
//	        for (Map.Entry<Character,Integer> e : hm.entrySet()) {
//	            System.out.println(
//	                "Character is :"+e.getKey()+ " and its count is string is "+ e.getValue());
//	        }
//	    }
	
	public static void main(String[] args) {
//		String str= "how are you";
//		HashMap<Character,Integer> hm = new HashMap<>();
//		for(int i=0;i<input.length();i++) {
//			char current = input.charAt(i);
//			if(current == ' ') {
//				continue;
//			}
//			if(hm.containsKey(current)) {
//				hm.put(current, hm.get(current)+1);
//			}else {
//				hm.put(current, 1);
//			}
//		}
//		for(Map.Entry<Character, Integer> e : hm.entrySet()) {
//			System.out.println("Charcater :" + e.getKey()+ " " + " occurs " + e.getValue());
//		}
		
		
		String str = "hackerraaankearthhh";
		ArrayList<Character> al = new ArrayList<>();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!= ' ') {
			al.add(str.charAt(i));
		}
		}
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i=0; i<al.size(); i++) {
			hm.putIfAbsent(al.get(i), Collections.frequency(al, al.get(i)));
		}
		for(Map.Entry<Character, Integer> e : hm.entrySet()) {
		//	if(e.getValue()>1) {
			System.out.println("Character is :" + e.getKey()+ " and its count is string is " + e.getValue());
		}
	}
	
	
	}
	
	
//	}
	
	

