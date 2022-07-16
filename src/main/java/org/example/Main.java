package org.example;

public class Main {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 110;
        for (int number = lowerbound; number <= upperbound; ++number) {
            // Print "Coza" if number is divisible by 3
            if (number % 3 == 0) {
                System.out.print("Coza");
            }
            // Print "Loza" if number is divisible by 5
            else if (number % 5 == 0) {
                System.out.println("Loza");
            }
//                if (number % 5 ==0) {
//                    System.out.print("Loza");
//                }
            // Print "Woza" if number is divisible by 7
            else if (number % 7 == 0) {
                System.out.println("Woza");
            }
            // Print the number if it is not divisible by 3, 5 and 7
            else if (number % 3 == 1 || number % 5 == 1 || number % 7 == 1) {
                System.out.println("number");
            }
            // Print a newline if number is divisible by 11; else print a space
            else if (number % 11 == 0) {
                System.out.println("new line");
            } else
                System.out.println("space");

        }
    }
}

