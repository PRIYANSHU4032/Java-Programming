import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1=sc.nextLine();
		getReverse(s1);
	}
	public static void getReverse(String s1)
	{
		String rev="";
		for(int i=s1.length()-1;i>=0;i--){
			rev=rev+s1.charAt(i);
		}
		System.out.println("Reverse is: "+rev);
	}
}
