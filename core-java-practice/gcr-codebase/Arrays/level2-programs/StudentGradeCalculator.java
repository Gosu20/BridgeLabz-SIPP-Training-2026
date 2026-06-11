import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        int[] physics = new int[number];
        int[] chemistry = new int[number];
        int[] maths = new int[number];

        double[] percentage = new double[number];
        char[] grade = new char[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Physics: ");
            physics[i] = input.nextInt();

            System.out.print("Chemistry: ");
            chemistry[i] = input.nextInt();

            System.out.print("Maths: ");
            maths[i] = input.nextInt();

            percentage[i] =
                    (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 75) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 40) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Percentage = " +
                    percentage[i] +
                    " Grade = " + grade[i]);
        }

        input.close();
    }
}