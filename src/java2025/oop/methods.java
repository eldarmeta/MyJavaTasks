package java2025.oop;

public class methods {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()
        int age = 17;

        if (ageCheck(age)) {
            System.out.println("You may sign up!");
        } else {
            System.out.println("You must be 18+ to sign up");
        }
    }
        static void happyBirthday(String name,int age){
        }
        static double square(double number) {
        return number * number;}
    static double cube(double number) {
        return number * number * number; }
    static String getFullName(String first, String last) {
        return first + " " + last;}
    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        }
            else{
                return false;
            }
        }
    }
















//        String name = "Mike";
//        int age = 999;
//
//        happyBirthday(name, age);
//
//    }
//    static void happyBirthday(String name, int age){
//        System.out.println("Happy Birthday to you!");
//        System.out.printf("Happy Birthday dear %s!\n", name);
//        System.out.printf("You are %d years you!\n", age);
//        System.out.println("Happy Birthday to you!\n");
