package String;

import java.util.Scanner;

public class NonRepeatingCharinString {
    public static void main(String[] args) {
        System.out.println("Enter the String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        findNonRepating(str);
    }
    public  static void findNonRepating(String str1){
        String str = str1.toLowerCase();
        int j=0;
        for(int i=0;i<str.length();i++){
           // int count =1;
            for( j=0;j<str.length();j++){
                if(i != j && str.charAt(i)==str.charAt(j)){
                   // count++
                    break;
                }
            }
            if(j==str.length()){
                System.out.println("The first non repeating is "+str.charAt(i)+" and his index is "+i);
                break;
            }
        }
    }
}
