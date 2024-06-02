import java.util.Scanner;

public class Palindrom {
   public static void main(String[] args) {
    String str =" ";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the STRING");
    str=sc.nextLine();

    checkPalindrome(str);
   }

public static void checkPalindrome(String str) {
    str = str.toLowerCase();
    for(int i=0;i<str.length()/2;i++){
        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            System.out.println("String is not palindrom");
        }
        else{
            System.out.println("String is palindrome");
        }

    }
} 
}
