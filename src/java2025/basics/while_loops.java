package java2025.basics;

import java.util.Scanner;

public class while_loops {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while(number < 1 || number > 10){
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        }
         System.out.print("You picked " + number);



//        int age = 0;
//
//        do{
//
//            System.out.println("Your age can't be negative");
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt();
//
//        }while(age < 0);
//        System.out.println("You are " + age + " years old!");

        scanner.close();
    }

}
