package java2025.basics;

public class ternary_operator1 {
    public static void main(String[] args){

        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse


        int number = 6;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        int score = 60;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        int time = 23;
        String timeOfDay = (time < 12) ? "AM" : "PM";
        System.out.println(timeOfDay);

        int income = 33000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        double tax = income * taxRate;
        System.out.println("Tax: " + tax);


    }
}
