public class ReverseCharArray {

    public static void main(String[] args) {
        char [] s = new char[]{'h','e','l','l','o'};
        ReverseCharArray obj = new ReverseCharArray();
        obj.reverseString(s);
    }

    public void reverseString(char[] s) {
        int start = 0, end = s.length - 1 ;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

}
