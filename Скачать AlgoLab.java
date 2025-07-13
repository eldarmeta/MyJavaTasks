
import java.util.Arrays;
import java.util.Scanner;

public class AlgoLab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n\uD83E\uDDE0 Welcome to the Algorithm Lab \uD83E\uDDEA");
            System.out.println("Choose an algorithm to test:");
            System.out.println("1. Binary Search");
            System.out.println("2. Bubble Sort");
            System.out.println("3. Factorial (Recursion)");
            System.out.println("4. Fibonacci (Iterative + Recursive)");
            System.out.println("5. Palindrome Checker");
            System.out.println("6. Reverse Array");
            System.out.println("7. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> binarySearch(scanner);
                case 2 -> bubbleSort(scanner);
                case 3 -> factorial(scanner);
                case 4 -> fibonacci(scanner);
                case 5 -> palindrome(scanner);
                case 6 -> reverseArray(scanner);
                case 7 -> System.out.println("\uD83D\uDEAA Exiting AlgoLab...");
                default -> System.out.println("\u2757 Invalid choice. Try again.");
            }

        } while (choice != 7);

        scanner.close();
    }

    public static void binarySearch(Scanner scanner) {
        int[] arr = {3, 6, 8, 12, 14, 18, 21, 24, 30};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.print("Enter value to search: ");
        int target = scanner.nextInt();
        int left = 0, right = arr.length - 1, mid;
        boolean found = false;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("\u2705 Found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else right = mid - 1;
        }

        if (!found) System.out.println("\u274C Not found");
    }

    public static void bubbleSort(Scanner scanner) {
        int[] arr = {5, 2, 9, 1, 3};
        System.out.println("Unsorted: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        System.out.println("\u2705 Sorted: " + Arrays.toString(arr));
    }

    public static void factorial(Scanner scanner) {
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Result: " + factorialRecursive(n));
    }

    public static int factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void fibonacci(Scanner scanner) {
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();

        System.out.print("Iterative: ");
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        System.out.print("\nRecursive (" + n + "th term): ");
        System.out.println(fibRecursive(n));
    }

    public static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static void palindrome(Scanner scanner) {
        System.out.print("Enter a word: ");
        String word = scanner.next();
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reversed))
            System.out.println("\u2705 It's a palindrome");
        else
            System.out.println("\u274C Not a palindrome");
    }

    public static void reverseArray(Scanner scanner) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original: " + Arrays.toString(arr));
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}
