public class MoveZeroesToRight {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeroesToRight obj = new MoveZeroesToRight();
        obj.moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {
        int counter = 0;
        for (int i : nums) {
            if (i != 0) {
                nums[counter] = i;
                counter++;
            }
        }

        for (int i = counter; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
