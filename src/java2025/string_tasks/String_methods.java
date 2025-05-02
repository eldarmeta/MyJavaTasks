package java2025.string_tasks;

import java.util.Scanner;

public class String_methods {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter your name: ");
String name = scanner.nextLine();

//        int length = name.length();
//        char letter = name.charAt(0);
//        int index = name.indexOf(" ");
//        int lastIndex = name.lastIndexOf("o");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace ("Abdivaitov", "Kagan");

       if(name.trim().isEmpty()) {
           System.out.println("Name is empty");
           return;
       }
        if (name.contains(" ")){

            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name does not contain a space");

        }
        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
            return;
        }
               else {
           System.out.println("Salam, " + name + "!");
       }


scanner.close();
    }
}

