public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("        PALINDROME CHECKER APP");
        System.out.println("=================================");
        System.out.println("Version : 1.0");
        System.out.println();

        // UC3 – Reverse String Method

        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}