package stringprogram;

public class WordReverse {

	public static void main(String[] args) {
		String str= "Wellcome  my java";
		
		String[] stringA =str.split(" ");
		for(int i= stringA.length-1; i>=0; i--) {
			System.out.print(stringA[i] + ' ');
		}
		}

	}


