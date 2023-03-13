package Section5_ExpressionsStatementsAndMore;

public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(1, 2, 1);
        // Expected: Neither all are equal nor different
    }
    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else {
            if (a == b && a == c) {
                System.out.println("All numbers are equal");
            } else {
                if (a == b || a == c || b == c) {
                    System.out.println("Neither all are equal nor different");
                } else {
                    System.out.println("All numbers are different");
                }
            }
        }
    }
}
