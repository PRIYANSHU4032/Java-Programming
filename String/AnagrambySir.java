package String;

import java.util.Scanner;

public class AnagrambySir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string ");
        String s2 = sc.nextLine();
        System.out.println(isAnagram(s1, s2) ? "The strings are anagrams." : "The strings are not anagrams.");
    }


public static boolean isAnagram(String s1, String s2){
    int count1[] = getCount(s1);
    int count2[] = getCount(s2);
    for(int i=0;i<count1.length;i++){
        if(count1[i] != count2[i]){
            return false;
        }
    }

    return true;
}




public static int[] getCount(String s){
    int arr[] = new int[26];
    for(int i=0;i<s.length();i++){
        char x = s.charAt(i);
        if(x>= 65 && x<=90){
            arr[x-65]++;//arr[0]++

        }else if(x>= 97 && x<= 122){
            arr[x-97]++;
        }
    }
    return arr;
}

}
