// Write a program that takes two strings representing numbers, converts them to wrapper classes, and performs basic arithmetic operations (addition, subtraction, multiplication, division).

import java.util.Scanner;
public class Experiment02 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        String num1=sc.nextLine();
        System.out.println("Enter second number: ");
        String num2=sc.nextLine();
        
        //wrapper class
        Double number1=Double.valueOf(num1);
        Double number2=Double.valueOf(num2);

        double add=number1 + number2;
        double sub=number1 - number2;
        double mult=number1 * number2;

        System.out.println("Results:");
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);
        
        if (number2 != 0) {
            double div = number1 / number2;
            System.out.println("Division: " + div);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }
    }
}