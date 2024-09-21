public class test {
    public static void main(String[] args) {
        String s1 = "Hello";   // String literal, stored in String Pool
        String s2 = "Hello";
        String s3 = "he";
        // Same literal, refers to the same object in the String Pool

        System.out.println(s1 == s2);   // Output: true (same reference)

    }
}
