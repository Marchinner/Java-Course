package Section5_ExpressionsStatementsAndMore;

public class MethodOverloadingChallenge {

    public static void main(String[] args) {

        System.out.println(convertToCentimeters(23));
        System.out.println(convertToCentimeters(2, 23));
    }
    public static double convertToCentimeters(int heightInInches) {

        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeets, int heightInInches) {

        // return convertToCentimeters(heightInFeets * 12 + heightInInches);
        int feetToInches = heightInFeets * 12;
        int totalInches = feetToInches + heightInInches;
        return convertToCentimeters(totalInches);
    }
}
