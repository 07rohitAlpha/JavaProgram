package Task;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
//        int largest = 0;
//        int secondLargest = 0;
//        System.out.println("The given array is:");
////        for (int i = 0; i < arr.length; i++)
////        {
////            System.out.print(arr[i] + "\t");
////        }
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
//        }
//        System.out.println("\nSecond largest number is:" + secondLargest);

		int largest =0;
		int secondlargest=0;
		System.out.println("the given array is ");
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>largest) {
				secondlargest = largest;
				largest = arr[i];
			}else if(arr[i]>secondlargest)
			{
				secondlargest = arr[i];
			}
		}
		System.out.println(secondlargest + ": " + largest);
        
        
        
	}

}
