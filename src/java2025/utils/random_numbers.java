package java2025.utils;

import java.util.Random;

public class random_numbers {
    public static void main (String[] args){

        Random random = new Random();

//        int number;
//
//        number = random.nextInt(1,6);
//        int number1;
//        int number2;
//        int number3;
//
//        number1 = random.nextInt(1,101);
//        number2 = random.nextInt(1,101);
//        number3 = random.nextInt(1,101);
//
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);

//        double number;
//
//        number = random.nextDouble();
//
//    System.out.println(number);

        boolean isHeads;

        isHeads = random.nextBoolean();

//        System.out.println(isHeads);

        if(isHeads) {
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
}
