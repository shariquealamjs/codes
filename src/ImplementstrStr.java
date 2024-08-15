public class ImplementstrStr {

    public static void main(String[] args) {
        ImplementstrStr obj = new ImplementstrStr();
        String haystack = "a";
        String needle = "a";
        System.out.println(obj.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        int index = -1;
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= haystackLength - needleLength; i++){
            int j =0;

            while (j < needleLength && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }

            if (j == needleLength){
                index = i;
                break;
            }

            else
                index = -1;

        }
        return index;
    }
}
