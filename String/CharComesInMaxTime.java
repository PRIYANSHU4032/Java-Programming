package String;

import java.util.Scanner;

public class CharComesInMaxTime {
    public static void main(String[] args) {
        System.out.println("Enter the String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        findFrequency(str);
    }

    public static void findFrequency(String str) {
        int count = 0;
        int max = 0;
        char c =' ';
        int p[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            p[str.charAt(i)]++;
        }

        for (int i = 0; i < p.length; i++) {
            if(p[i]>=max){
                c = (char)i;
                max = p[i];

            }
        }
        System.out.println("the max frequency is "+c);


//            if (p[i] > 1) {
//                System.out.println((char) i + "   " + p[i]);
//                count++;
//            }
//            if(count>prev){
//                s1 = (char)i
//                System.out.println("the max char is "+s1);
//                return;
//            }else {
//                s1 = (char)i;
//            }
//
//
//        }
//
//        System.out.println("total char " + count);

    }
}
