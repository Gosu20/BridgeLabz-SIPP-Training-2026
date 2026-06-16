import java.util.Scanner;

public class EuclideanDistanceLineEquation {

    public static double findDistance(
            double x1,
            double y1,
            double x2,
            double y2) {

        return Math.sqrt(
                Math.pow(x2 - x1, 2)
                        + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(
            double x1,
            double y1,
            double x2,
            double y2) {

        double slope =
                (y2 - y1) / (x2 - x1);

        double intercept =
                y1 - (slope * x1);

        return new double[]{
                slope,
                intercept
        };
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        double distance =
                findDistance(
                        x1,
                        y1,
                        x2,
                        y2);

        double[] equation =
                findLineEquation(
                        x1,
                        y1,
                        x2,
                        y2);

        System.out.println(
                "Distance = " + distance);

        System.out.println(
                "Slope = " + equation[0]);

        System.out.println(
                "Y-Intercept = " + equation[1]);

        System.out.println(
                "Equation: y = "
                        + equation[0]
                        + "x + "
                        + equation[1]);

        scanner.close();
    }
}