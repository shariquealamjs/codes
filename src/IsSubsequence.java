public class IsSubsequence {

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println("hello");
        boolean result = isSubsequence.isSubsequence("ace", "xaacebde");
        System.out.println(result);
        System.out.println("hello");
    }

    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (j < t.length()) {
            if (t.charAt(j) == s.charAt(i)) {
                i++;
                j++;
            }
        }
        System.out.println(s.length());
        return (i == s.length());

    }
}
