package Task;

public class Duplic {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,7,8,8,2,3};
		System.out.println("Duplicate element in the array");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j])
				System.out.println(arr[j]);
			}
		
		}
	}

}
