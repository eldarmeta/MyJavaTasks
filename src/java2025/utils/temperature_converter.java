package java2025.utils;

import java.util.Scanner;

public class temperature_converter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = Double.parseDouble(scanner.next());

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): " );
        unit = scanner.next().toUpperCase();

        // (condition) ? true : false
        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;
        System.out.printf( "%.2f° %s", newTemp, unit);



     scanner.close();
    }
}
