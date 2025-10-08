// Problem: Two Sum (#1)
// Approach: Use HashMap to store value-index pairs.
// Time Complexity: O(n), Space: O(n)

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // (value → index)

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // number we need to find

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i); // store current value and its index
        }

        return new int[] {}; // return empty if no solution found
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
