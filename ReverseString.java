
import java.util.Arrays;

public class ReverseString {
    // LeetCode 344 — Reverse String (recursive, in-place)
    public static void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }

    private static void helper(char[] s, int left, int right) {
        if (left >= right) return; // base case
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        helper(s, left + 1, right - 1); // recursion
    }

    // Quick demo
    public static void main(String[] args) {
        char[] arr = "recursion".toCharArray();
        reverseString(arr);
        System.out.println(Arrays.toString(arr)); // Expected reversed array
    }
}
