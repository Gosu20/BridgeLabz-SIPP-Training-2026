import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generateScores(
            int numberOfStudents) {

        int[][] scores =
                new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {

            scores[i][0] =
                    (int) (Math.random() * 90) + 10;

            scores[i][1] =
                    (int) (Math.random() * 90) + 10;

            scores[i][2] =
                    (int) (Math.random() * 90) + 10;
        }

        return scores;
    }

    public static double[][] calculateResults(
            int[][] scores) {

        double[][] results =
                new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total =
                    scores[i][0]
                            + scores[i][1]
                            + scores[i][2];

            double average =
                    total / 3.0;

            double percentage =
                    total / 3.0;

            results[i][0] = total;

            results[i][1] =
                    Math.round(
                            average * 100.0)
                            / 100.0;

            results[i][2] =
                    Math.round(
                            percentage * 100.0)
                            / 100.0;
        }

        return results;
    }

    public static void displayScoreCard(
            int[][] scores,
            double[][] results) {

        System.out.println(
                "Physics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {

            System.out.printf(
                    "%d\t%d\t\t%d\t%d\t%.2f\t%.2f%n",
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    (int) results[i][0],
                    results[i][1],
                    results[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Enter Number Of Students: ");

        int numberOfStudents =
                scanner.nextInt();

        int[][] scores =
                generateScores(
                        numberOfStudents);

        double[][] results =
                calculateResults(scores);

        displayScoreCard(
                scores,
                results);

        scanner.close();
    }
}