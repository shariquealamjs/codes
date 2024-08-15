import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {


    public static void main(String[] args) {
        int[] arr1 = new int[]{4,9,5};
        int[] arr2 = new int[]{9,4,9,8,4};
        IntersectionOfTwoArrays intersection = new IntersectionOfTwoArrays();
        int[] result = intersection.intersect(arr1, arr2);
        for (int num : result) {
            System.out.print(num + " ");
        }

    }

    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list1 = new ArrayList<>();
        HashMap <Integer, Integer> map = new HashMap();
        for (int i: nums1)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i: nums2)
        {
            if (map.containsKey(i) && map.get(i) > 0)
            {
                map.put(i, map.get(i) - 1);
                list1.add(i);
            }
        }

        return list1.stream().mapToInt(i -> i).toArray();

    }

}
