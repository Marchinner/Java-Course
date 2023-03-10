package Section5_ExpressionsStatementsAndMore;

public class SecondsAndMinutesChallenge {
    // create a method that takes time represented in seconds as parameter
    // transform into hours and display with the remaining minutes and seconds in a string
    // do the transformation in two steps, overloading methods

    // create two methods with the same name: getDurationString
    // the first method has one parameter of type int, named seconds
    // the second method has two parameters named minutes and seconds, both ints.
    // both methods return a String in the format shown:
    // 'XXh YYm ZZs'
    // first method should return to the second method
    // 1 min = 60 seconds, 1 h = 60 min = 3600 sec

    public static void main(String[] args) {

        // example value. Result must be 0h 41m 40s
        System.out.println(getDurationString(2500));
    }
    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid Value!";
        } else {
            int minutes = seconds / 60;
            return getDurationString(minutes, seconds);
        }
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 && (seconds >= 0 && seconds < 60)) {
            return "Invalid Values!";
        } else {
            int hours = minutes / 60;

            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;

            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        }
    }
}
