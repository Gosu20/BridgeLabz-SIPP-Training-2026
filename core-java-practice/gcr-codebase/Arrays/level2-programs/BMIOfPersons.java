import java.util.Scanner;

public class BMIOfPersons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight (kg): ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height (cm): ");
            height[i] = input.nextDouble();

            double heightInMeter = height[i] / 100;
            bmi[i] = weight[i] / (heightInMeter * heightInMeter);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Height: " + height[i] +
                    " Weight: " + weight[i] +
                    " BMI: " + bmi[i] +
                    " Status: " + status[i]);
        }

        input.close();
    }
}