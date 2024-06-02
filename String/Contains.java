package String;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str = sc.nextLine();
    removeDublicate(str);
   } 


   public static void removeDublicate(String str){
    String res =" ";
    for(int i=0;i<str.length();i++){
        if(!res.contains(str.charAt(i)+"")){
            res = res+str.charAt(i);
        }
    }
    System.out.println(res);
   }
}
