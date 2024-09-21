import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = new int[]{2,3,5,1,3};
        int n = 3;
        KidsWithCandies obj = new KidsWithCandies();
        List<Boolean> output = obj.kidsWithCandies(candies, n);
        for (Boolean b : output) {
            System.out.println(b.toString());
        }

    }


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        int[] sum = new int[candies.length];
        for (int i = 0; i < sum.length; i++) {
            sum[i] =candies[i]+extraCandies;
            if(sum[i]>=max)
            {
                result.add(true);
            }
            else
                result.add(false);
        }
        return result;
    }
}
