public class FirstAndLastPositionOfAnElementInASortedArray {

    public static void main(String[] args) {
        FirstAndLastPositionOfAnElementInASortedArray obj = new FirstAndLastPositionOfAnElementInASortedArray();
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        int[] result = new int[2];
        result = obj.findFirst(nums, target);
        for (int i:result) {
            System.out.println(i);
        }
    }

    public int[] findFirst(int[] nums, int target)
    {
        int first = -1, last = -1;
        int n = nums.length;

        for (int i =0; i<n; i++)
        {
            if (nums[i] == target)
            {
              if (first == -1)
                  first = i;

              last = i;

            }
        }

        return new int[]{first,last};
    }
}
