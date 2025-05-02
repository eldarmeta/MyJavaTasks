package java2025.basics;

import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        String result = (num1 == num2) ?
                "Numbers are equal." :
                (num1 > num2) ?
                        "First number is greater by " + (num1 - num2) :
                        "Second number is greater by " + (num2 - num1);

        System.out.println(result);

        scanner.close();
    }
}
