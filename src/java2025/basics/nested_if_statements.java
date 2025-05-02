package java2025.basics;

import java.util.Scanner;

public class nested_if_statements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Are you a senior? (true/false): ");
        boolean isSenior = scanner.nextBoolean();

        double price = 19.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            } else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            } else {
                // Без скидок
                price *= 1;
            }
        }

        System.out.printf("The total price is: $%.2f\n", price);

        scanner.close();
    }
}