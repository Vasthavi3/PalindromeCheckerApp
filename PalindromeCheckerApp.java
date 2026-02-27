public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER APP");
        System.out.println("=================================");
        System.out.println();

        String input = "A man a plan a canal Panama";

        // Choose strategy here
        PalindromeStrategy strategy = new ReverseStrategy();
        // To switch algorithm:
        // PalindromeStrategy strategy = new RecursiveStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.execute(input);

        if (result) {
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome");
        }
    }
}