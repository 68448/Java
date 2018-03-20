package lab1;



public class TestCalc {
    public static void main(String[] args) {

        String type = "double";

        sumTest(type);
        subTest(type);
        multTest(type);
        divTest(type);
    }



    private static void sumTest(String type) {
        System.out.println("\nTest of sum[" + type +"]:");


        switch (type) {

            case "int":

                if (Calc.sum(-10000, -4575) != -14575) {
                    System.out.println("Failed [-10000 + (-4575)]");
                }

                if (Calc.sum(100, -24) != 76) {
                    System.out.println("Failed. [100 + (-24)]");
                }
                break;

            case "double":

                if (Calc.sum(2.3, 4.1) != 6.4) {
                    System.out.println("Failed. [2.1 + 4.1]");
                }

                if (Calc.sum(-2.0, 7.35) != 5.35) {
                    System.out.println("Failed. [-2.0 + 7.35]");
                }
                break;
        }

        if (Calc.sum(0, 0) != 0) {
            System.out.println("Failed. [0 + 0]");
        }
    }


    private static void subTest(String type) {
        System.out.println("\nTest of sub[" + type + "]...");


        switch (type) {

            case "int":

                if (Calc.sub(5, 1000) != -995) {
                    System.out.println("Failed. [5 - 1000]");
                }

                if (Calc.sub(7, 5) != 2) {
                    System.out.println("Failed. [7 - 5]");
                }
                break;

            case "double":

                if (Calc.sub(15.4, 5.4) != 10.0) {
                    System.out.println("Failed. [15.4 - 5.4]");
                }

                if (Calc.sub(-23.5, 4.7) != -28.2) {
                    System.out.println("Failed. [-23.5 - 4.7]");
                }
                break;
        }

        if (Calc.sub(-1, 0) != -1) {
            System.out.println("Failed. [-1 - 0]");
        }
    }


    private static void multTest(String type) {
        System.out.println("\nTest of mult[" + type + "]...");


        switch (type) {

            case "int":

                if (Calc.mult(2, 2) != 4) {
                    System.out.println("Failed. [2 * 6]");
                }

                if (Calc.mult(4, -4) != -16) {
                    System.out.println("Failed. [4 * (-2)]");
                }
                break;

            case "double":

                if (Calc.mult(2.2, 1.4) != 3.08) {
                    System.out.println("Failed. [2.2 * 1.4]");
                }

                if (Calc.mult(-0.8, 7.55) != -6.04) {
                    System.out.println("Failed. [-0.8 * 7.55]");
                }
                break;
        }

        if (Calc.mult(43, 0) != 0) {
            System.out.println("Failed. [43 * 0]");
        }
    }


    private static void divTest(String type) {
        System.out.println("\nTest of div[" + type + "]...");


        switch (type) {

            case "int":

                if (Calc.div(24, 8) != 3) {
                    System.out.println("Failed. [24 / 8]");
                }

                if (Calc.div(-99, 11) != -9) {
                    System.out.println("Failed. [-99 / 11]");
                }
                break;

            case "double":

                if (Calc.div(2.0, 4.0) != 0.5) {
                    System.out.println("Failed. [2 / 4]");
                }

                if (Calc.div(12.6, -4.2) != -3.0) {
                    System.out.println("Failed. [12.6 / (-3.0)]");
                }
        }

        if (Calc.div(0, 10) != 0) {
            System.out.println("Failed. [0 / 10]");
        }
    }
}