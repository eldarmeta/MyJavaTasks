import java.util.HashMap;

class Solution {
    // LeetCode 560. Subarray Sum Equals K
    // Time: O(n), Space: O(n)
    public int subarraySum(int[] nums, int k) {
        // prefixSum -> number of times we've seen this sum
        HashMap<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1); // empty prefix to count subarrays starting at index 0

        int prefix = 0;
        int count = 0;

        for (int x : nums) {
            prefix += x;
            // We want number of previous prefixes = prefix - k
            count += freq.getOrDefault(prefix - k, 0);
            // Record current prefix
            freq.put(prefix, freq.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}
