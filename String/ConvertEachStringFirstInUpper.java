package String;

import java.util.Locale;
import java.util.Scanner;

public class ConvertEachStringFirstInUpper {
    public static void main(String[] args) {
        System.out.println("Enter the String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //findFrequency(str);
        changeToUpper(str);
    }

    public static void changeToUpper(String str) {
            String res =" ";
            for (int i=0;i<str.length();i++){
                char x = str.charAt(i);
                if((i==0  && x!=' '|| str.charAt(i-1) == ' ' && x != ' ' )&& x >=97 && x<= 122){
                    res = res+(char)(x-32);//to change it upper case we minus 32 and vise versa
                }else {
                    res = res+x;
                }
            }
        System.out.println(res);

    }

}