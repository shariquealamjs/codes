public class RotateArray {

    public static void main(String[] args) {
        int[] arr   = new int[]{1,2,3,4,5,6,7};
        RotateArray rotate = new RotateArray();
        rotate.rotate(arr,3);

    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        int d = k%n;
        rotateEntireArray(nums, 0, n);
        rotateEntireArray(nums,0, d);
        rotateEntireArray(nums, d, n);

    }

    public void rotateEntireArray(int[] nums, int start, int end){

        System.out.println("----------");
        end = end-1;
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums [end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

}
