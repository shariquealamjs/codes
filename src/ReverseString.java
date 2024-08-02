import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString main = new ReverseString();
        main.getReversedString("Sharique");
        main.getReversedStringByStack("Sharique");
    }
    public void getReversedString(String str)
    {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            reversedString = reversedString + str.charAt(i);

        }
        System.out.println(reversedString);
    }

    public void getReversedStringByStack(String str)
    {
        Stack<Character> stack = new Stack<Character>();
        String reversedString = "";
        for (int i=0; i<str.length(); i++ )
        {
            stack.push(str.charAt(i));
        }

        while (! stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
    }


}