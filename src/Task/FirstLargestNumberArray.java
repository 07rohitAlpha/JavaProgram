package Task;

public class FirstLargestNumberArray {

	public static void main(String[] args) {
		
		        int arr[] = {12, 35, 1, 10, 34, 1};

		        int largest = 0;
		        int firstLargest = 0;

		       
		    

//		    public static int findLargest(int[] arr) {
//		        // Edge case: if the array is empty
//		        if (arr.length == 0) {
//		            throw new IllegalArgumentException("Array is empty");
//		        }

		        // Initialize the largest variable to the first element of the array
	//	        int largest = arr[0];

		        // Iterate through the array
		        for (int i = 0; i < arr.length; i++) {
		            // Update largest if the current element is greater
		            if (arr[i] > largest) {
		            	firstLargest = largest;
		                largest = arr[i];
		            }
		            else if (arr[i] > firstLargest) {
		            	firstLargest= arr[i];
		            }
		        }
		        System.out.println(firstLargest);

		      //  return largest;
		    }
		

	}


