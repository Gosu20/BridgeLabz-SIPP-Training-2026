import java.util.Scanner;

public class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        int[][] marks = new int[number][3];

        double[] percentage = new double[number];
        char[] grade = new char[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Physics: ");
            marks[i][0] = input.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = input.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = input.nextInt();

            percentage[i] =
                    (marks[i][0] +
                     marks[i][1] +
                     marks[i][2]) / 3.0;

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