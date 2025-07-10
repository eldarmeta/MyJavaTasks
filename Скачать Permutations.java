
// Java-программа для генерации всех перестановок строки (комбинаторика)
import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        String input = "ABC";
        List<String> result = new ArrayList<>();
        permute(input, 0, input.length() - 1, result);

        System.out.println("All permutations of '" + input + "':");
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static void permute(String str, int l, int r, List<String> result) {
        if (l == r)
            result.add(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r, result);
                str = swap(str, l, i); // backtrack
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char[] charArray = a.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
