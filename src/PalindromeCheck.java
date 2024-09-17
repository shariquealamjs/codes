public class PalindromeCheck {
    public static void main(String[] args) {
        String first = "dal";
        PalindromeCheck palindromeCheck = new PalindromeCheck();
        System.out.println(palindromeCheck.isPalindrome(first));
    }

    public boolean isPalindrome(String s) {
        boolean palindrome = true;
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                palindrome = false;
            }
            low++;
            high--;
        }
        return palindrome;

    }
}
