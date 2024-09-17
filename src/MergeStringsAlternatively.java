public class MergeStringsAlternatively {

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        MergeStringsAlternatively ms = new MergeStringsAlternatively();

        System.out.println("String is:  \t"+ ms.mergeAlternately(word1, word2));
    }

    public String mergeAlternately(String word1, String word2) {

        String merged = "";
        int i = 0;
        System.out.println("hello");

        while(i<word1.length() || i<word2.length()) {
            if(i<word1.length())
            {
                merged = merged+word1.charAt(i);
            }

            if(i<word2.length())
            {
                merged = merged+word2.charAt(i);
            }

            i++;

        }
        return merged;


    }
}
