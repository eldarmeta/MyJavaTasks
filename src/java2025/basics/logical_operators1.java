package java2025.basics;

import java.util.Scanner;

public class logical_operators1 {
    public static void main(String[] args){

        // && = AND
        // || = OR
        // ! = NOT

        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4 and 12 characters!");
        }
          else if (username.contains(" ") || username.contains("_")){
            System.out.println("Username cannot contain spaces or underscores!");
        }
          else{
            System.out.println("Welcome " + username);
        }

        scanner.close();



    }
}
