import java.util.Scanner;

public class UnitConverterLength2 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Yards: ");
        double yards = scanner.nextDouble();

        System.out.println("Feet = " +
                convertYardsToFeet(yards));

        System.out.print("Enter Feet: ");
        double feet = scanner.nextDouble();

        System.out.println("Yards = " +
                convertFeetToYards(feet));

        System.out.print("Enter Meters: ");
        double meters = scanner.nextDouble();

        System.out.println("Inches = " +
                convertMetersToInches(meters));

        System.out.print("Enter Inches: ");
        double inches = scanner.nextDouble();

        System.out.println("Meters = " +
                convertInchesToMeters(inches));

        System.out.println("Centimeters = " +
                convertInchesToCentimeters(inches));

        scanner.close();
    }
}