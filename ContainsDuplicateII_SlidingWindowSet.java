import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 219: Contains Duplicate II
 * Variant 3 — Sliding window with HashSet: O(n) time, O(min(n, k)) space.
 * Maintain a window of last k elements. If current value already in the window, return true.
 */
public class ContainsDuplicateII_SlidingWindowSet {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || k < 0) return false;
        Set<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) return true;
            window.add(nums[i]);
            if (window.size() > k) {
                // Remove the element that falls out of the window of size k
                window.remove(nums[i - k]);
            }
        }
        return false;
    }
}