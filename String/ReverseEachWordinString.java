package String;

import java.util.Scanner;

public class ReverseEachWordinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s1 = sc.nextLine();
        String res= " ";
        String output = " ";
        int count=0;

        for(int i=0;i<s1.length();i++){
            char x = s1.charAt(i);
            if(x != ' '){
                res = res+x;
                //res = res+i;
            }
           

            if(x == ' ' && !res.isBlank()|| i == s1.length()-1 && x!=' '){
                
                    System.out.println(res);
                    res=" ";
                
            }
            
        }

        //System.out.println(res);
    }
    
}
