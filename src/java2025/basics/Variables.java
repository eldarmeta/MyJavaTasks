package java2025.basics;

public class Variables {
    public static void main(String[] args)  {


        int age = 23;
        int year = 2025;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline =  true;

        /* if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are NOT student");
        } */

        //String name = "Eldar Abdivaitov";
        String food = "besh";
        String email = "eldarmeta@outlook.com";
        String car = "Toyota";
        String color = "white";

        /*
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is " + gpa);
        System.out.println("Your avarage latter grade is " + grade);
       */

        /* System.out.println("Your choice is a " + color +" "+ year +" "+ car);
        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("Thre is a " + car + " for sale");
                    }
        else{
            System.out.println("The " + car + " is not for sale");
        }
    }*/


        String name = "Eldar Abdivaitov";
        int gta = 6;
        double pi = 3.14159;
        char gender = 'M';
        boolean isAdmin = true;

        System.out.println( "Your name is " + name);
        System.out.println( "your favorite game is GTA " + gta);
        System.out.println( "Pi number is " + pi);
        System.out.println( "Your gender is " + gender);

        if(isAdmin){
            System.out.println( "your assignment was Done " + name);
        }
        else {
            System.out.println("You failed your HW " + name);
        }
}
}


