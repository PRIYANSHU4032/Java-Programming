package String;

import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        System.out.println(checkPanagram(str));

    }

    public static boolean checkPanagram(String s1){
        int count[] = getCount(s1);
        for(int i:count){
            if(i == 0){
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
