
public class Fibonacci {
    // LeetCode 509 — Fibonacci Number (recursive)
    public static int fib(int n) {
        if (n <= 1) return n;            // base case
        return fib(n - 1) + fib(n - 2);  // recursion
    }

    // Quick demo
    public static void main(String[] args) {
        int n = 10;
        System.out.println("fib(" + n + ") = " + fib(n)); // Expected: 55
    }
}
