import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {

        double heightMeter = heightCm / 100;

        return weight / (heightMeter * heightMeter);
    }

    public static String getBMIStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] people = new double[10][3];

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter Weight (kg): ");
            people[i][0] = scanner.nextDouble();

            System.out.print("Enter Height (cm): ");
            people[i][1] = scanner.nextDouble();

            people[i][2] = calculateBMI(
                    people[i][0],
                    people[i][1]
            );
        }

        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < 10; i++) {

            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    people[i][0],
                    people[i][1],
                    people[i][2],
                    getBMIStatus(people[i][2]));
        }

        scanner.close();
    }
}