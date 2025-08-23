
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // Peak is on the left side (including mid)
                right = mid;
            } else {
                // Peak is on the right side
                left = mid + 1;
            }
        }

        return left; // or right, since left == right
    }

    public static void main(String[] args) {
        FindPeakElement solution = new FindPeakElement();
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("Peak element index: " + solution.findPeakElement(nums));
    }
}
