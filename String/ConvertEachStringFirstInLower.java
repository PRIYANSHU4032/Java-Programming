package String;

import java.util.Scanner;

public class ConvertEachStringFirstInLower {
    public static void main(String[] args) {
        System.out.println("Enter the String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //findFrequency(str);
        changeToLower(str);
    }

    public static void changeToLower(String str) {
        String res =" ";
        for (int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if((i==0  && x!=' '|| str.charAt(i-1) == ' ' && x != ' ' )&& x >=65 && x<= 90){
                res = res+(char)(x+32);//to change it lower case we plus 32 and vise versa
            }else {
                res = res+x;
            }
        }
        System.out.println(res);

    }
}
