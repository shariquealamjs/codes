import java.util.HashMap;

public class FirstUniqueCharacterOfAString {
    public static void main(String[] args) {
        String text = "dddccdbba";
        FirstUniqueCharacterOfAString obj = new FirstUniqueCharacterOfAString();
        System.out.println(obj.firstUniqChar(text));
    }

    public int firstUniqChar(String s) {
        int index = -1;

        if (s == null || s.length() == 0) {
            return index;
        }


        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                index = i;
                break;
            }
        }

        return index;
    }
}
