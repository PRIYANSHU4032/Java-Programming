package String;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sum=0;
        char prev='+';
        
        System.out.println("Enter the first number: ");
        int result = sc.nextInt();
         sum = sum+result;
        
        System.out.println("Enter the Operation");
         char curr = sc.next().charAt(0);
        do {
            
            System.out.println("Enter the second number");
            int num = sc.nextInt();

            switch (curr) {
                case '+':
                    sum +=num;
                    
                    break;
                case '-':
                    sum -= num;
                    break;
                case '*':
                    if(prev == '+'){
                        sum -=result;
                        sum += result*num;
                    }else if(prev == '-'){
                        sum += result;
                        sum -= result*num;
                    }
                    
                    break;
                case '/':
                if(prev == '+'){
                    sum -=result;
                    sum += result/num;
                }else if(prev == '-'){
                    sum += result;
                    sum -= result/num;
                }
                    break;
            
                default:
                    System.out.println("Invaild Input");
                    break;

                
            }
            result = num;
            prev = curr;
            System.out.println("Enter the operator ");
            curr = sc.next().charAt(0);
        } while (curr != '=');

        System.out.println(sum);
    }
}
