package Section5_ExpressionsStatementsAndMore;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay <= 23 && hourOfDay >= 0) {
            return (hourOfDay < 8 || hourOfDay > 22) && barking;
        } else {
            return false;
        }
    }
}
