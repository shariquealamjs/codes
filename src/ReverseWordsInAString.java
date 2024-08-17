public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "Welcome to geeksforgeeks";
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        System.out.println("Method 1" + reverseWordsInAString.reverseWords(s));
        System.out.println("Method 2" + reverseWordsInAString.reverseWordsAndCharacter(s));

    }

    public String reverseWords(String s) {
        String reversed = "";
        String arr[] = s.trim().split("\\s");
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed = reversed + arr[i] + " ";
        }
        return reversed;
    }

    public String reverseWordsAndCharacter(String s) {
        String reversed = "";
        String arr[] = s.trim().split("\\s");
        for(int i = 0; i<arr.length; i++){
            String reversedWord = "";
            for(int j = arr[i].length()-1; j>=0; j--){
                reversedWord = reversedWord + arr[i].charAt(j);
            }
            reversed = reversed + reversedWord + " ";


        }
        return reversed;
    }
}
