package String;

import java.util.Scanner;

public class EvenLength {
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
           

            if(x == ' ' && !res.isBlank()|| i == s1.length()-1){
                
                   if(res.length()%2 == 0){
                        System.out.println(res);
                        
                   }
                   res=" ";
            }
            
      
    }
    }
}
