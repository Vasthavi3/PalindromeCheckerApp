public class PalindromeService {

    public boolean checkPalindrome(String input) {

        String word = input.toLowerCase().replaceAll(" ", "");

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}