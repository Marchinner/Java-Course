package Section5_ExpressionsStatementsAndMore;

public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 31));
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }
}
