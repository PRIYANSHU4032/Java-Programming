package String;

import java.util.Scanner;

public class NonRepeatingChar2 {
    public static void main(String[] args) {
        System.out.println("Enter the String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        findNonRepating(str);
    }

    public static void findNonRepating(String str){
        int p[] = new int[256];
        for (int i=0;i<str.length();i++){
            p[str.charAt(i)]++;
        }

        for(int i=0;i<str.length();i++){
            char x =str.charAt(i);
            if(p[x]==1){
                System.out.println("The first non repeating char is "+x+" and index ix "+i);
                return;
            }
        }
        System.out.println("there is no non repeating char");
    }
}
