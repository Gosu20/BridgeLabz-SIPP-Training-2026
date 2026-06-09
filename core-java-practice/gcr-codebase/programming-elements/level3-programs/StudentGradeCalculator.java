import java.util.Scanner;

class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double physicsMarks = input.nextDouble();
        double chemistryMarks = input.nextDouble();
        double mathsMarks = input.nextDouble();

        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = totalMarks / 3;

        String grade;
        String remarks;

        if (percentage >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "B";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "C";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "D";
            remarks = "Average";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);

        input.close();
    }
}