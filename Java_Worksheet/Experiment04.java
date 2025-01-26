//Design a program for a basic banking system that calculates the average account balance by dividing the total balance by the number of account holders and verifies transaction IDs from an array. The program should demonstrate robust exception handling using multiple try-catch blocks to manage two specific scenarios: an ArithmeticException for division by zero when there are no account holders and an ArrayIndexOutOfBoundsException for accessing invalid indices in the transaction ID array.

import java.util.Scanner;

public class Experiment04 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] transactionIDs = {101, 102, 103, 104, 105};

            try {
                System.out.print("Enter the total balance: ");
                double totalBalance = scanner.nextDouble();

                System.out.print("Enter the number of account holders: ");
                int numOfAccountHolders = scanner.nextInt();

                if (numOfAccountHolders <= 0) {
                    throw new ArithmeticException("Number of account holders must be greater than zero.");
                }

                double averageBalance = totalBalance / numOfAccountHolders;
                System.out.printf("Average Account Balance: %.2f%n", averageBalance);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println();

            try {
                System.out.print("Enter the transaction ID index to access (0-4): ");
                int index = scanner.nextInt();

                if (index < 0 || index >= transactionIDs.length) {
                    throw new ArrayIndexOutOfBoundsException("Invalid index.");
                }

                System.out.println("Transaction ID: " + transactionIDs[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid index. Please enter a valid index between 0 and 4.");
            }
        }
    }
}
