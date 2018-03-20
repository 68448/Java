package lab1;


import java.math.BigDecimal;
import java.math.RoundingMode;


public class Calc {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return new BigDecimal(a + b).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }


    public static int sub(int a, int b) {
        return a - b;
    }

    public static double sub(double a, double b) {
        return new BigDecimal(a - b).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }


    public static int mult(int a, int b) {
        return a * b;
    }

    public static double mult(double a, double b) {
        return new BigDecimal(a * b).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }


    public static int div(int a, int b) {
        return a / b;
    }

    public static double div(double a, double b) {
        return new BigDecimal(a / b).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }

}