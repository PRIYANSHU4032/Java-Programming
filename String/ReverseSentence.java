package String;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printReverse(str);
    }

    public static void printReverse(String str){
        String word = " ";
        for(int i=str.length()-1;i>=0;i--){
            char x = str.charAt(i);
            if(x != ' '){
                word = x+word;

            }
            if(x==' '  || i==0 && !word.isBlank()){
                System.out.print(word);
                word = " ";
            }
        }
    }
}
