package String;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = " ";
        System.out.println("Enter the String ");
        str = sc.nextLine();
        System.out.println(countWords(str));
    }

    public static int countWords(String str){
        int count=0;
        /*for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ')
            count ++;
        }*/
        for(int i=0;i<str.length();i++){
            if(i==0 && str.charAt(i)!= ' ' || str.charAt(i-1)== ' '&& str.charAt(i)!= ' '){
                count++;
            }
        }
        return count;
    }
}
