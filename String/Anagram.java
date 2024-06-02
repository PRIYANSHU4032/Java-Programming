package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string ");
        String s2 = sc.nextLine();
        System.out.println(isAnagram(s1,s2));
    }

    public static boolean isAnagram(String s1, String s2) {
        // Remove any whitespace and convert to lowercase for a fair comparison
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they can't be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        // Sort the char arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare the sorted arrays
        return Arrays.equals(array1, array2);
    }
}
