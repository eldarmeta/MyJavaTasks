/**
 * LeetCode 219: Contains Duplicate II
 * Variant 2 — Bounded double loop: O(n * k) time, O(1) space.
 * For each i, only check indices j in (i, i+k].
 * Faster than full O(n^2) when k << n.
 */
public class ContainsDuplicateII_BoundedDoubleLoop {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || k < 0) return false;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int end = Math.min(n - 1, i + k);
            for (int j = i + 1; j <= end; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
}