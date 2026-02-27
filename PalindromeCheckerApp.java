public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   PALINDROME PERFORMANCE TEST");
        System.out.println("=================================");
        System.out.println();

        String input = "A man a plan a canal Panama";

        // Reverse Strategy
        PalindromeStrategy reverse = new ReverseStrategy();
        long start1 = System.nanoTime();
        boolean result1 = reverse.check(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Recursive Strategy
        PalindromeStrategy recursive = new RecursiveStrategy();
        long start2 = System.nanoTime();
        boolean result2 = recursive.check(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        System.out.println("Reverse Strategy Result: " + result1);
        System.out.println("Reverse Strategy Time: " + time1 + " ns");
        System.out.println();

        System.out.println("Recursive Strategy Result: " + result2);
        System.out.println("Recursive Strategy Time: " + time2 + " ns");
        System.out.println();

        if (time1 < time2) {
            System.out.println("Reverse Strategy is faster.");
        } else {
            System.out.println("Recursive Strategy is faster.");
        }
    }
}