package java2025.basics;

import java.util.Scanner;

public class nested_loops {
    public static void main(String[] args){

        // nested loop = A loop inside another loop
        // Used often with matrices or DS&A

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }


     scanner.close();

    }
}


//for(int i = 1; i <= 3; i++){
//            for(int j = 1; j <= 9; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }