public class AtoI {
    public static void main(String[] args) {
        String s = "  -042";
        AtoI a = new AtoI();
        System.out.println(a.myAtoi(s));

    }

    public int myAtoi(String s) {

        int INT_MAX = 2147483647;
        int INT_MIN = -2147483648;
        int digit = 0;
        int result = 0;

        int i = 0;
        int n = s.length();
        boolean isNegative = false;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                isNegative = true;
            }
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            digit = s.charAt(i) - '0';
            if (result > (INT_MAX - digit) / 10) {
                return isNegative ? INT_MIN : INT_MAX;
            }
            result = result * 10 + digit;
            i++;
        }

        return isNegative ? -result : result;
    }
}
