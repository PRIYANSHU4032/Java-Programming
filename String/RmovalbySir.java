package String;

import java.util.Scanner;

public class RmovalbySir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        removeString(str);
        sc.close();
    }

    public static void removeString(String str){
        //int count;
        str =str+'\0';
        for(int i=0;i<str.indexOf('\0');i++){
            int j;
            for(j=str.indexOf('\0');j<str.length();j++){
                if(str.charAt(i)== str.charAt(j)){
                    break;
                }
            }
            if(j==str.length()){
                str=str+str.charAt(i);
            }
        }
        for(int i=str.indexOf('\0');i<str.length();i++){
            System.out.print(str.charAt(i));
        }

    }
}
