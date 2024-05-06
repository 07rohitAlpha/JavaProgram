package Practice;

public class SIngleDimArray {

	public static void main(String[] args) {
		
		int a[]= {100, 200, 300, 400, 500};
		System.out.println("length of the array" + a.length); // prints length of the array
		for(int i :a) {
			System.out.println(i);
		}
		// how to break for loop in the middle
		for(int i:a)
		{
			if(i== 400)
			{
				break;
			}
			System.out.println(i);
		}

	}

}
