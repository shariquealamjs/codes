public class GDCofStrings {

    public static void main(String[] args) {
        String a = "ABCDABCDABCD";
        String b = "ABC";
        GDCofStrings g = new GDCofStrings();
        System.out.println(g.gcdOfStrings(a,b));
    }

    public String gcdOfStrings(String str1, String str2) {
        String result="";

        if(!((str1+str2).equals(str2+str1)))
            return result;
        int length = gcd(str1.length(), str2.length());

        result = str2.substring(0,length);
        return result;
    }
    public int gcd(int a, int b) {
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }
}
