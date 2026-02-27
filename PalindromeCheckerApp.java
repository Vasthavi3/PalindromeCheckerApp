public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("        PALINDROME CHECKER APP");
        System.out.println("=================================");
        System.out.println("Version : 1.0");
        System.out.println();

        String input = "A man a plan a canal Panama";

        // Create object of service class
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome");
        }
    }
}