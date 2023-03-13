package Section5_ExpressionsStatementsAndMore;

public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {

        long minutes = 4225523;
        System.out.println("Input = " + minutes);
        printYearsAndDays(minutes);

    }

    public static void printYearsAndDays(long minutes) {

        if (minutes >= 0) {
            long days = (minutes % 525600) / 1440;
            long years = minutes / 525600;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
