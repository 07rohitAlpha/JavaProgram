package Task;

public class SecondLargestandSmallest {

	
	public static void main(String[] args) {
		int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//        int secondsmallest = Integer.MAX_VALUE;
//        System.out.println("The given array is:");
//    
//        for (int i = 0; i < arr.length; i++)
//        {
//            if (arr[i] > largest)
//            {
//                secondLargest = largest;
//                largest = arr[i];
//            }
//            else if (arr[i] > secondLargest)
//            {
//                secondLargest = arr[i];
//            }
//            
//            if(arr[i] <smallest) {
//            	secondsmallest = smallest;
//            	smallest = arr[i];
//            }
//            else if (arr[i]<secondsmallest) {
//            	secondsmallest = arr[i];
//            }
//                 
//}
//        
//        System.out.println("\nSecond largest number is:" + secondLargest);
//        System.out.println("\nSecond largest number is:" + secondsmallest);
//        
		
		int largest= Integer.MIN_VALUE;
		int secondlargest= Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int secondsmallest= Integer.MAX_VALUE;
		System.out.println("The given array is");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				secondlargest= largest;
				largest=arr[i];
			}
			else if(arr[i]>secondlargest) {
				secondlargest= arr[i];
			}
			if(arr[i]<smallest) {
				secondsmallest= smallest;
				smallest=arr[i];
			}
			else if(arr[i]<secondsmallest) {
				secondsmallest= arr[i];
			}
		}
		System.out.println(secondlargest);
		System.out.println(secondsmallest);
		
		
		
		
		
		
	}	
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
	












	
