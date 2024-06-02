package String;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        System.out.println("Welcome to  Calculator!");
        System.out.println("Enter the first number:");
        result = scanner.nextDouble();

        while (true) {
            System.out.println("Enter the operation (+, -, *, /, =):");
            char operation = scanner.next().charAt(0);

            if (operation == '=') {
                break;
            }

            System.out.println("Enter the next number:");
            double nextNumber = scanner.nextDouble();

            switch (operation) {
                case '+':
                    result += nextNumber;
                    break;
                case '-':
                    result -= nextNumber;
                    break;
                case '*':
                    result *= nextNumber;
                    break;
                case '/':
                    
                     result /= nextNumber;
                    
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
