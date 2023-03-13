package Section6_ControlFlow;

public class DayOfWeekChallenge {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            printDayOfWeek(i);
            printWeekDay(i);
        }
    }

    public static void printDayOfWeek(int day) {

        String dayOfTheWeek = switch (day) {
            case 0 -> { yield "Sunday"; }
            case 1 -> { yield "Monday"; }
            case 2 -> { yield "Tuesday"; }
            case 3 -> { yield "Wednesday"; }
            case 4 -> { yield "Thursday"; }
            case 5 -> { yield "Friday"; }
            case 6 -> { yield "Saturday"; }

            default -> { yield "Invalid day"; }
        };
        System.out.println("Day: " + day + ", day of the week: " + dayOfTheWeek);
    }

    public static void printWeekDay(int day) {

        String weekDay = "Invalid Day";
        if (day == 0) {
            weekDay = "Sunday";
        } else if (day == 1) {
            weekDay = "Monday";
        } else if (day == 2) {
            weekDay = "Tuesday";
        } else if (day == 3) {
            weekDay = "Wednesday";
        } else if (day == 4) {
            weekDay = "Thursday";
        } else if (day == 5) {
            weekDay = "Friday";
        } else if (day == 6) {
            weekDay = "Saturday";
        }

        System.out.println("Day: " + day + ", Week day: " + weekDay);
    }
}
