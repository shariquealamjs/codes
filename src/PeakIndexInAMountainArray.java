public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        PeakIndexInAMountainArray p = new PeakIndexInAMountainArray();
        int[] nums  = new   int[]{24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        int[] x = new int[] {0,1,0};
        System.out.println(p.peakIndexInMountainArrayUsingLinearSearch(x));
        System.out.println(p.peakIndexInMountainArrayUsingLinearSearch(nums));
        System.out.println(p.peakIndexInMountainArrayUsingBinarySearch(x));
        System.out.println(p.peakIndexInMountainArrayUsingBinarySearch(nums));


    }

    public int peakIndexInMountainArrayUsingLinearSearch(int[] nums) {
        int index  = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]) {
                index = i;
                break;
            }
        }

        return index;
    }

    public int peakIndexInMountainArrayUsingBinarySearch(int[] nums) {
        int index  = -1;
        int low = 0, high = nums.length-1;
        while(low<high)
        {
            int mid = (low+(high-low))/2;
            if(nums[mid]>nums[mid+1])
                high = mid;

            else
                low = mid+1;

        }

        return low;
    }
}
