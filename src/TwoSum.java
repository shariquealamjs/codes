import java.util.HashMap;
import java.util.Map;

class TwoSum {

    public static void main(String[] args) {
        int []arr = new int[]{1, 2, 4, 5};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        twoSum.twoSum(arr, target);

    }
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Add the current number and its index to the map
            map.put(nums[i], i);
        }

        // Return statement for completeness, though it's not expected to reach here
        throw new IllegalArgumentException("No two sum solution");
    }
}