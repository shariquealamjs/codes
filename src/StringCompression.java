import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    public static void main(String[] args) {

        char[] chars = new char[]{'a','a','b','b','c','c','c'};
        StringCompression obj = new StringCompression();


    }

    public int compress(char[] chars) {

        int n = chars.length;
        int i = 0;
        int index = 0;

        while(i<chars.length)
        {
            int count = 0;
            char currentChar = chars[i];

            while(i<chars.length && chars[i] == currentChar)
            {
                count++;
                i++;
            }
            chars[index++] = currentChar;
            if(count>1)
            {
                for(char x: String.valueOf(count).toCharArray())
                {
                    chars[index++] = x;
                    System.out.println(x);
                }
            }


        }

        return index;

    }
}
