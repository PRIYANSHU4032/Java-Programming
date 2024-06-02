package String;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printReverse(str);
    }

    public static void printReverse(String str){
        String word = " ";
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if(x != ' '){
                word = x+word;

            }
            if(x==' '  || i==str.length()-1 && !word.isBlank()){
                System.out.print(word);
                word = " ";
            }
        }
    }
}
