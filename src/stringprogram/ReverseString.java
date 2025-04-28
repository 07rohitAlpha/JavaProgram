package stringprogram;

public class ReverseString {

    public static void main(String[] args) {
        String str = "ab$cbd%fej";
        String reverseStr = "";
        String word = "";

        for (int i = 0; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) != '$' && str.charAt(i) != '%') {
                word += str.charAt(i); // Build word until special character
            } else {
                // Reverse the word and add it to result
                reverseStr += reverse(word);
                word = ""; // Reset word

                // Add special character (if in range)
                if (i < str.length()) {
                    reverseStr += str.charAt(i);
                }
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + reverseStr);
    }

    // Helper method to reverse a string
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
