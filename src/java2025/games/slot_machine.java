package java2025.games;

import java.util.Random;
import java.util.Scanner;

public class slot_machine {
    public static void main(String[] args){

        // JAVA SLOT MACHINE

        Scanner scanner = new Scanner(System.in);
        // DECLARE VARIABLES
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // DISPLAY WELCOME MESSAGE
        System.out.println("**************************");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println(" Symbols: 🍒 🍉 🍋 🫃 🌟");
        System.out.println("***************************");

        // PLAY IF BALANCE > 0
        while (balance > 0){
            // ENTER BET AMOUNT
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

                //       VERIFY IF BET > BALANCE
            if(bet > balance){
                System.out.println("Insufficient funds");
                continue;
            }
            //       VERIFY IF BET > 0
            else if(bet <= 0){
                System.out.println("Bet must be greater than 0");
            continue;
            }
            //       SUBTRACT BET FROM BALANCE
            else{
                balance = balance - bet;
            }
            // SPIN ROW
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout > 0){
                System.out.println("You won $" + payout);
                balance = balance + payout;
            }
            else {
                System.out.println("Sorry you lost this round!");
            }
            // ASK TO PLAY AGAIN
            System.out.print("Do you want to play again? (y/n): ");
        playAgain = scanner.nextLine().toLowerCase();

        if(!playAgain.equals("y")){
         break;
          }
        }
        // DISPLAY EXIT MESSAGE
        System.out.println("GAME OVER! YOUR FINAL BALANCE IS $" + balance);

        scanner.close();
    }
    static String[] spinRow(){
        String[] symbols = {"🍒", "🍉", "🍋", "🫃", "🌟"};
        String[] row = new String[3];
        Random random = new Random();


        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    // PRINT ROW
    static void printRow(String[] row){
        System.out.println("****************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("****************");

    }
    // GET PAYOUT
    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return  switch (row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🫃" -> bet * 10;
                case "🌟" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return  switch (row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🫃" -> bet * 6;
                case "🌟" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return  switch (row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🫃" -> bet * 6;
                case "🌟" -> bet * 10;
                default -> 0;
            };
        }

        return  0;
    }

}
