package java2025.utils;

import java.util.Scanner;

public class compound_interest_calculator {
    public static void main(String[] args) {

        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompounded;
        double years;
        double amount;


        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timeCompounded, timeCompounded * years);

        System.out.println();
        System.out.printf("The amount after %.1f years: $%.2f%n", years, amount);

        scanner.close();
    }

}
