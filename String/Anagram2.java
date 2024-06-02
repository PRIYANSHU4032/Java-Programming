package String;

import java.util.Scanner;

public class Anagram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string ");
        String s2 = sc.nextLine();
        System.out.println(isAnagram(s1, s2) ? "The strings are anagrams." : "The strings are not anagrams.");
    }

    public static boolean isAnagram(String s1, String s2) {
        // Remove any whitespace and convert to lowercase for a fair comparison
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they can't be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Create an array to count the frequency of each character
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Increment the count for each character in s1
        for (char c : s1.toCharArray()) {
            charCount[c]++;
        }

        // Decrement the count for each character in s2
        for (char c : s2.toCharArray()) {
            charCount[c]--;
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}

