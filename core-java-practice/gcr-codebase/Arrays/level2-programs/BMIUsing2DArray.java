import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight (kg): ");
            personData[i][0] = input.nextDouble();

            System.out.print("Enter height (cm): ");
            personData[i][1] = input.nextDouble();

            double heightInMeter = personData[i][1] / 100;

            personData[i][2] =
                    personData[i][0] / (heightInMeter * heightInMeter);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println(
                    "Weight: " + personData[i][0] +
                    " Height: " + personData[i][1] +
                    " BMI: " + personData[i][2] +
                    " Status: " + weightStatus[i]);
        }

        input.close();
    }
}