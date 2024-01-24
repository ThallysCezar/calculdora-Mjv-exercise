package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueOrNot;
        String stringResult = "Result of the chosen operation: ";

        do {
            System.out.println("--------- MJV School Java Calculator Initialized ----------");
            
            System.out.print("Enter the first number: ");
            double n1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double n2 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Choose the operation: +, -, / e *: ");
            String operation = scanner.nextLine();

            switch (operation) {
                case "+":
                    System.out.print(stringResult + (n1 + n2));
                    break;
                case "-":
                    if(n1 > n2){
                        System.out.print(stringResult + (n1 - n2));
                    }
                    System.out.print(stringResult + (n2 - n1));
                    break;
                case "*":
                    System.out.print(stringResult + (n1 * n2));
                    break;
                case "/":
                    if (n2 != 0) {
                        System.out.print(stringResult + (n1 / n2));
                    } else {
                        System.out.print("Mathematical error, division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid operation! Try again!");
            }

            System.out.print("Do you want to do any more operations? (Y/S): ");
            continueOrNot = scanner.next().charAt(0);

        } while (continueOrNot != 'Y' && continueOrNot != 'y');
        System.out.println("--------- MJV School Java Calculator closed ----------");
        scanner.close();
    }
}