package Section5_ExpressionsStatementsAndMore;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println("Circle with radius of 5 = " + area(5) + " area");
        System.out.println("Rectangle with side 3 and 4 = " + area(3, 4) + " area");
    }

    public static double area(double radius) {
/*
        if (radius <= 0) {
            return -1;
        } else {
            return radius * radius * Math.PI;
        }
    }
*/
        return (radius < 0) ? -1 : radius * radius * Math.PI;
    }

    public static double area(double x,double y) {
/*
        if (x <= 0 || y <= 0) {
            return -1;
        } else {
            return x * y;
        }
*/
        return (x < 0 || y < 0) ? -1 : x * y;
    }
}
