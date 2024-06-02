import java.util.Scanner;

public class Replace_Underscore {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1=sc.nextLine();
		getResultString(s1);
	}
	public static void getResultString(String s1)
	{
		String result="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
				result=result+s1.charAt(i);
			else
				result=result+'_';
		}
		System.out.println("String is: "+result);
	}
    
}