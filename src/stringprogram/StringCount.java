package stringprogram;



public class StringCount {

	public static void main(String[] args) {
		
		String a= "Javapragram rohit";
		int Count =0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i) != ' ') {
				Count ++;
			}
		}
		System.out.println(Count);
		
		
		}

	}





	
	
	
	
	

