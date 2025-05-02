package java2025.arrays;

import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Чтение количества элементов
        int[] arr = new int[n];    // Объявление массива

        // Чтение элементов массива
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Вывод элементов с чётными индексами
        for (int i = 0; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
