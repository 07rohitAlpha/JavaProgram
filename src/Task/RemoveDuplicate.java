package Task;

public class RemoveDuplicate {

	public static void main(String[] args) {

        String input = "apppliiation";
        String output = " ";

        for (int i = 0; i < input.length(); i++) {
        	Boolean found = false;
            for (int j = 0; j < output.length(); j++) {
                if (input.charAt(i) == output.charAt(j)) {
                    found = true;
                }
            }
            if(found== false) {
            output = output.concat(String.valueOf(input.charAt(i)));
            
            
        }
        }
        
        
        System.out.println("output:"+output);

    }

}