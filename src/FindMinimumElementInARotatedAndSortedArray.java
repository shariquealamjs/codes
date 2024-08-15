public class FindMinimumElementInARotatedAndSortedArray {

    public static void main(String[] args) {
        FindMinimumElementInARotatedAndSortedArray obj = new FindMinimumElementInARotatedAndSortedArray();
        System.out.println(obj.findMin(new int[]{6, 7, 8,9, 1, 2, 3, 4, 5}));
    }

    public int findMin(int[] nums) {

        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<min)
            {
                min = nums[i];
                break;
            }
        }

        return min;
    }
}
