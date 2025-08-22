/**
 * LeetCode 219: Contains Duplicate II
 * Variant 1 — Brute Force over ALL pairs: O(n^2) time, O(1) space.
 * Checks every pair (i, j) with i < j and returns true if nums[i] == nums[j] and (j - i) <= k.
 * This is the slowest but simplest approach.
 */
public class ContainsDuplicateII_BruteForceAllPairs {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || k < 0) return false;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j] && j - i <= k) return true;
            }
        }
        return false;
    }
}