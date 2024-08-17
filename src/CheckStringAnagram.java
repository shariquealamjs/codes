import java.util.HashMap;

public class CheckStringAnagram {
    public static void main(String[] args) {
        CheckStringAnagram checkStringAnagram = new CheckStringAnagram();
        String first = "evil";
        String second = "vile";
        System.out.println(checkStringAnagram.checkAnagram(first, second));

    }

    public boolean checkAnagram(String s, String t) {
        boolean result = false;
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            if(!map.containsKey(t.charAt(i))) {
                result = false;
                break;
            }
            else if(map.containsKey(t.charAt(i)))
            {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                if(map.get(t.charAt(i)) == 0) {
                    map.remove(t.charAt(i));
                }
            }

        }
        return map.isEmpty();
    }

}
