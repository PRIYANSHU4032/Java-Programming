package String;

import java.util.Scanner;

public class StringFrequency {
    public static void main(String[] args) {
        System.out.println("Enter the String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        findFrequency(str);
    }

    public static void findFrequency(String str) {
        int p[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            p[str.charAt(i)]++;
        }

        for (int i = 0; i < p.length; i++) {
            if (p[i] > 0 && i != 32) {
                //System.out.println((char)i+" is present "+p[i]+" times");
                if(p[i]==1){
                    System.out.println((char)i+"   "+p[i]);
                }


            }
          //  System.out.println("there is no non repeating char");
        }
    }
}
