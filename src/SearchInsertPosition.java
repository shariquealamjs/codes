public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 6};
        int target = 5;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(arr, target));
    }
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid =low + (high - low) / 2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if (target< nums[mid])
                high = mid-1;

            else
                low = mid+1;
        }
        return low;
    }
}
