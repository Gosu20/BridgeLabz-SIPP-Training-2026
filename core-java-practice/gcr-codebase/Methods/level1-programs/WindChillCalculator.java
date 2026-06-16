import java.util.Scanner;

public class WindChillCalculator {

    public double calculateWindChill(double temperature, double windSpeed) {

        return 35.74 + (0.6215 * temperature)
                + ((0.4275 * temperature) - 35.75)
                * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter Wind Speed: ");
        double windSpeed = scanner.nextDouble();

        WindChillCalculator calculator = new WindChillCalculator();

        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        System.out.println("Wind Chill = " + windChill);

        scanner.close();
    }
}