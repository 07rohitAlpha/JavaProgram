package Task;

import java.util.Arrays;

public class MaxandMinNumber {

	public static void main(String[] args) {
		
		int ar[] = {1,23,24,45,56,344,355,766};
		
		// First method using inbuild method to find the MAx and Min number in array
//		Arrays.sort(ar);
//		System.out.println("-Min " + ar[0]+ " Max " + ar[ar.length-1] );
		
		int max= ar[0];
		int min= ar[0];
		for(int i =0; i<ar.length; i++) {
			if(ar[i]>max) {
				max= ar[i];
			}
			if(ar[i]<min) {
				min= ar[i];
			}
		}
		System.out.println("Min : " + min+ " Max : " + max);
		
		
		
	}

}
