package java2025.games;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {

        // ROCK PAPER SCISSORS GAME

        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
        // GET CHOICE FROM THE USER
        System.out.print("Enter your move (rock, paper, scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();
        if(!playerChoice.equals("rock") &&
                !playerChoice.equals("paper") &&
                     !playerChoice.equals("scissors")){
            System.out.println("invalid choice");
            continue;
        }
        // GET RANDOM CHOICE FOR THE COMPUTER
        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice is " + computerChoice);

        // CHECK WIN CONDITIONS
        if(playerChoice.equals(computerChoice)){
           System.out.println("It's a tie");
        }
        else if(playerChoice.equals("rock") && computerChoice.equals("scissors")){
            System.out.println("You win!");
        }
        else if(playerChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("You win!");
        }
        else if(playerChoice.equals("paper") && computerChoice.equals("rock")) {
            System.out.println("You win!");
        }
        else{
            System.out.println("You lose!");
        }
        // ASK TO PLAY AGAIN?
        System.out.print("Play again (yes/no): ");
        playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));


        // GOODBYE MESSAGE
        System.out.println("Thanks for playing!");


      scanner.close();
    }
}
