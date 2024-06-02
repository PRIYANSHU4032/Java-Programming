import java.util.Scanner;

public class Evensum {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1=sc.nextLine();
		getEvenDigitSum(s1);
	}
	public static void getEvenDigitSum(String s1)
	{
		int sum=0;
		for(int i=0;i<s1.length();i++){
			char x=s1.charAt(i);
			if(x>='0' && x<='9' && x%2==0)
				sum=sum+(x-48);
		}
		System.out.println("Sum is: "+sum);
	}
}
