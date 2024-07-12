package stringprogram;

public class WordReverse {

	public static void main(String[] args) {
		String str= "Wellcome  my java";
		
		String[] stringArray =str.split(" ");
		for(int i= stringArray.length-1; i>=0; i--) {
			System.out.print(stringArray[i]);
		}
		}

	}


