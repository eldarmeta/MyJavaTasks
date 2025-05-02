package java2025.basics;

import java.util.Scanner;

public class for_loops {
    public static void main(String[] args) throws InterruptedException {

        // for loop = execute some code a CERTAIN amount of time

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds to countdown from?: ");
          int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
System.out.println("Happy new year!");
        scanner.close();

    }
}

//Scanner scanner =new Scanner(System.in);
//        System.out.print("Enter how many times you want to loop: ");
//        int max = scanner.nextInt();
//
//        for(int i = 1; i <= max; i++){
//            System.out.println(i);
