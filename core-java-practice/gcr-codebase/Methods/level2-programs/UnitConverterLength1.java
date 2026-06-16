import java.util.Scanner;

public class UnitConverterLength1 {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Kilometers: ");
        double kilometers = scanner.nextDouble();

        System.out.println("Miles = " +
                convertKmToMiles(kilometers));

        System.out.print("Enter Miles: ");
        double miles = scanner.nextDouble();

        System.out.println("Kilometers = " +
                convertMilesToKm(miles));

        System.out.print("Enter Meters: ");
        double meters = scanner.nextDouble();

        System.out.println("Feet = " +
                convertMetersToFeet(meters));

        System.out.print("Enter Feet: ");
        double feet = scanner.nextDouble();

        System.out.println("Meters = " +
                convertFeetToMeters(feet));

        scanner.close();
    }
}