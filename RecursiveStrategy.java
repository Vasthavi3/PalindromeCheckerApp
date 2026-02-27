public class RecursiveStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        String word = input.toLowerCase().replaceAll(" ", "");
        return isPalindrome(word, 0, word.length() - 1);
    }

    private boolean isPalindrome(String str, int start, int end) {

        if (start >= end) return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isPalindrome(str, start + 1, end - 1);
    }
}