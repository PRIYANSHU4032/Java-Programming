import java.util.Scanner;

public class RemoveDublicateString {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str = sc.nextLine();
    removeDublicate(str);
   } 


   public static void removeDublicate(String str){
    String s1 =" ";
    int x[] = new int[256];
    for(int i=0;i<str.length();i++){
        x[str.charAt(i)]++;
    }

    for(int i=0;i<x.length;i++){
        if(x[i]==1){
            s1 = s1+(char)i;
        }
    }
    System.out.println(s1);
   }
}
