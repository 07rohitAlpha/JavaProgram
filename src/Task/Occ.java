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
		String str = "JAVA";
		
		ArrayList<Character> al = new ArrayList<>();
		for(int i= 0; i<str.length();i++) {
			al.add(str.charAt(i));
		}
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			hm.putIfAbsent(al.get(i), Collections.frequency(al, al.get(i)));
		}
		
		for(Map.Entry<Character, Integer> e : hm.entrySet()) {
			System.out.println("Character is : " + e.getKey()+ " and it's count is  String is :" + e.getValue());
		}
	}
	
	
	
	}
	
	

