import java.util.Arrays;
import java.util.HashMap;

class HelloWorld {

    public static void main(String[] args) {
        int [] nums = new int []{2,7,11,15};
        int target = 9;
        HelloWorld obj = new HelloWorld();
        System.out.println(Arrays.toString(obj.getIndex(nums, target)));
    }

    public int[] getIndex(int [] nums, int target)
    {
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        for(int i =0; i <nums.length; i++)
        {
            numberMap.put(nums[i], i);
        }
        for( int j =0; j<nums.length; j++)
        {
            int other = target - nums[j];
            if(numberMap.containsKey(other) && numberMap.get(other) != j)
            {
                return new int[] { j, numberMap.get(other) };
            }
        }
        return null;
    }
}