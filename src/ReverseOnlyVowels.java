import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ReverseOnlyVowels {
    public static void main(String[] args) {
        String s = "IceCreAm";
        ReverseOnlyVowels r = new ReverseOnlyVowels();
        String resultString = r.reverseVowels(s);
        System.out.println(resultString);
    }

    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' ||s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I'  ||s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U')
                vowels.add(s.charAt(i));
        }

        char arr[] = new char[s.length()];
        int counter = vowels.size()-1;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' ||s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I'  ||s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U')
            {
               arr[i] = vowels.get(counter);
                counter--;
            }
            else
                arr[i] = s.charAt(i);
        }

        String str = String.valueOf(arr);
        return str;

    }

}
