package String;

import java.util.Scanner;

public class Mycode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1 = sc.nextLine();
        removeDuplicates(s1);
    }

    public static void removeDuplicates(String s1) {
        s1 = s1 + '\0'; 
        int len = 0;

        for (int i = 0;; i++) {
            if (s1.charAt(i) == '\0') {
                break;
            }
            len++;
        }

        for (int i = 0; i < len; i++) {
            char currentChar = s1.charAt(i);
            int j;
            for (j = 0; j < i; j++) {
                if (s1.charAt(j) == currentChar) {
                    break;
                }
            }
            if (j == i) { 
                System.out.print(currentChar);
            }
        }
    }
}
