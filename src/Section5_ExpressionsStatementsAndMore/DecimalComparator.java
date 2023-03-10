package Section5_ExpressionsStatementsAndMore;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        int number1Checked = (int) (number1 * 1000);
        int number2Checked = (int) (number2 * 1000);

        return number1Checked == number2Checked;
    }
}
