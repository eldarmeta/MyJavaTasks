package java2025.utils;

import java.util.Scanner;

public class weight_converter {
    public static void main(String[] args){

        //WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter your weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.45359237;
            System.out.printf("Your weight in kgs is: %.2f", newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter your weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462262;
            System.out.printf("Your weight in lbs is: %.2f", newWeight);

        } else {
                    System.out.println("Invalid choice");
        }



scanner.close();
    }
}
