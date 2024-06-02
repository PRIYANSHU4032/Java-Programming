import java.util.HashSet;
import java.util.Set;

public class Removedublicate {
    public static void main(String[] args) {
        String input = "programming";
        String result = removeStr(input);
        System.out.println("Original string: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeStr(String str) {
        // Use a set to track seen characters
        Set<Character> seen = new HashSet<>();
        // Use a StringBuilder to build the result string
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // If the character has not been seen, append it to the result
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
