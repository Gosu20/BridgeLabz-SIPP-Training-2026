import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();

        double average = (physics + chemistry + maths) / 3;

        String grade;
        String remarks;

        if (average >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (average >= 75) {
            grade = "B";
            remarks = "Good";
        } else if (average >= 50) {
            grade = "C";
            remarks = "Average";
        } else {
            grade = "D";
            remarks = "Fail";
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}