import java.util.HashMap;

public class OnlyOneOccurenceOfAString {

    public static void main(String[] args) {
        String name = "ShariqueMohammadAlam";
        String namenew = name.toLowerCase();
        String result = "";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < namenew.length(); i++) {
            if (!map.containsKey(namenew.charAt(i))) {
                map.put(namenew.charAt(i), 1);
                result = result+ namenew.charAt(i);
            }

        }


        System.out.println(result);


    }
}
