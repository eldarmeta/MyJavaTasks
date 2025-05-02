package java2025.basics;

import java.util.Scanner;

public class enhanced_switches {
    public static void main(String[] args) {

        // Enhanced switch = A replacement to many else if statements
        //        (Java14 feature)

        Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the day of the week: ");
       String day = scanner.nextLine().trim();
       day = day.substring(0,1).toUpperCase() + day.substring(1).toLowerCase();

        switch(day) {

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's a weekday :) ");
//            case "Monday" -> System.out.println("It's a weekday :( ");
//            case "Tuesday" -> System.out.println("It's a weekday :( ");
//            case "Wednesday" -> System.out.println("It's a weekday :( ");
//            case "Thursday" -> System.out.println("It's a weekday ;( ");
//            case "Friday" -> System.out.println("It's a weekday ;) ");
            case "Saturday" -> System.out.println("Weekends are fun :) ");
            case "Sunday" -> System.out.println("Weekends are fun :) ");
            default -> System.out.println(day + " is not a valid day");
        }
        scanner.close();

    }
    }
