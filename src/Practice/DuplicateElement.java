package Practice;

public class DuplicateElement {

	public static void main(String[] args) {
		
		
		// Initialize array
        int[] arr = {1, 2, 1, 4, 1, 1, 1, 8,3,2,2};
        System.out.println("Duplicate element in given array:");

        boolean duplicateFound = false;

        // Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                    duplicateFound = true;
                    break; // Exit the inner loop
                }
            }
            if (duplicateFound) {
                break; // Exit the outer loop
            }
        }

        // If no duplicates were found, print a message
        if (!duplicateFound) {
            System.out.println("No duplicates found.");
        }
		
		
//		//initialize array
//		
//		int[] arr = new int[] {1,2,1,4,1,1,1,8,3};
//		System.out.println("Duplicate element in given array.");
//		// Searches for duplicate element
//		for(int i=0; i<arr.length; i++) {
//			for (int j=i+1; j<arr.length; j++) {
//				if(arr[i]==arr[j])
//					System.out.println(arr[j]);
//			}
//		}
//			

	}

}
