import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write your input numbs: ");
        String line = scanner.nextLine();

        String[] parts = line.split(" ");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++){
            nums[i] = Integer.parseInt(parts[i]);
        }

        System.out.print("Write your target sum: ");
        int target = scanner.nextInt();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    System.out.println("[" + j + ", " + j + "]");
                    break;
                }
            }
        }

        scanner.close();
    }
}
