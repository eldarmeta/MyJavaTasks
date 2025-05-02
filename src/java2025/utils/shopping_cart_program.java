package java2025.utils;

import java.util.Scanner;

public class shopping_cart_program{
     public static void main(String[] args) {

         // SHOPING CART PROGRAM

         Scanner scanner = new Scanner(System.in);

         String item;
         double price;
         int quantity;
         char currency = '$';
         double total;

         System.out.print("What item would you like to buy?: ");
         item = scanner.nextLine();

         System.out.print("What is the price for each?: ");
         price = scanner.nextDouble();

         System.out.print("How many would you like?: ");
         quantity = scanner.nextInt();

         total = price * quantity;


         System.out.println("\nYou have bought " + quantity + " " + item + "/s");
         System.out.print("Your total is " + currency + total);

       scanner.close();
     }
}
