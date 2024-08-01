import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String name = "ShariqueMohammadAlam";
        String namenew = name.toLowerCase();
        String removedDuplicates = "";
        HashMap <Character, Integer> map = new HashMap<>();

        for (int i = 0; i < namenew.length(); i++) {
            map.put(namenew.charAt(i), map.getOrDefault(namenew.charAt(i), 0) + 1);
        }

        for (int i = 0; i < namenew.length(); i++) {
            if(map.containsKey(namenew.charAt(i)) && map.get(namenew.charAt(i)) == 1 )
            {
                removedDuplicates += namenew.charAt(i);
            }

        }

        System.out.println(removedDuplicates);

    }


}
