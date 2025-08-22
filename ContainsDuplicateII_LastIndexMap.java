import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 219: Contains Duplicate II
 * Variant 4 — HashMap of last seen indices: O(n) time, O(n) space.
 * For each number, check if we've seen it before and whether the distance is <= k.
 */
public class ContainsDuplicateII_LastIndexMap {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || k < 0) return false;
        Map<Integer, Integer> last = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer prev = last.get(nums[i]);
            if (prev != null && i - prev <= k) return true;
            last.put(nums[i], i);
        }
        return false;
    }
}