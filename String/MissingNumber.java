package String;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println("Enter the size ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter the number ");
        sc.nextLine();
        String str = sc.nextLine();
        findMissing(str,size);
    }

    public static void findMissing(String str,int size){
       int len = (size)*(size+1)/2;
       int strsum = 0;
       for (int i=0;i<str.length();i++){
           strsum = strsum+(str.charAt(i)-48);
       }
        System.out.println("the missing number is "+(len-strsum));
    }
}
