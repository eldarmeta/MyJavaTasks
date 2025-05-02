package java2025.utils;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double euroToUsd = 1.07;
        double gbpToUsd = 1.25;
        double kgsToUsd = 0.011;
        double rubToUsd = 0.010;
        double yenToUsd = 0.0065;

        System.out.println("=== Currency Converter ===");
        System.out.println("Supported currencies:");
        System.out.println("1. EUR (Euro)");
        System.out.println("2. GBP (British Pound)");
        System.out.println("3. KGS (Kyrgyz Som)");
        System.out.println("4. RUB (Russian Ruble)");
        System.out.println("5. JPY (Japanese Yen)");
        System.out.println("6. Exit");

        while (true) {
            System.out.print("\nEnter the number of the currency (1–6): ");
            int choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter the amount to convert: ");
            double amount = scanner.nextDouble();

            double result;

            switch (choice) {
                case 1:
                    result = amount * euroToUsd;
                    System.out.println(amount + " EUR = " + result + " USD");
                    break;
                case 2:
                    result = amount * gbpToUsd;
                    System.out.println(amount + " GBP = " + result + " USD");
                    break;
                case 3:
                    result = amount * kgsToUsd;
                    System.out.println(amount + " KGS = " + result + " USD");
                    break;
                case 4:
                    result = amount * rubToUsd;
                    System.out.println(amount + " RUB = " + result + " USD");
                    break;
                case 5:
                    result = amount * yenToUsd;
                    System.out.println(amount + " JPY = " + result + " USD");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}