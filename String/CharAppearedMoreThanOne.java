package String;

import java.util.Scanner;

public class CharAppearedMoreThanOne {
    public static void main(String[] args) {
        System.out.println("Enter the String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        findFrequency(str);
    }

    public static void findFrequency(String str) {
        int count = 0;
        int p[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            p[str.charAt(i)]++;
        }

        for (int i = 0; i < p.length; i++) {


            if (p[i] > 1 && i != 32) {
                System.out.println((char) i + "   " + p[i]);
                count++;
            }


        }
        System.out.println("total char " + count);

    }
}
