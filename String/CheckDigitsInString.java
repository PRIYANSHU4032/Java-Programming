package String;

import java.util.Scanner;

public class CheckDigitsInString {
    public static void main(String[] args) {
        System.out.println("Enter the String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        checkDigits(str);

    }

    public static void checkDigits(String str){
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if(!(x>='0'&& x<='9')){
                System.out.println("This string not contain digits ");
                return;
            }


        }
        System.out.println("This string  contain digits");

    }
}
