import java.util.Scanner;

public class PCMScorecard {

    // Generate random PCM marks for students
    public static int[][] generateScores(int students) {

        int[][] scores = new int[students][3]; // Physics, Chemistry, Maths

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 101); // Physics
            scores[i][1] = (int) (Math.random() * 101); // Chemistry
            scores[i][2] = (int) (Math.random() * 101); // Maths
        }

        return scores;
    }

    // Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][4];
        // [total, average, percentage, gradeCode]

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;

            result[i][3] = getGradeCode(percentage);
        }

        return result;
    }

    // Grade logic
    public static int getGradeCode(double percentage) {

        if (percentage >= 90) return 1; // A+
        else if (percentage >= 75) return 2; // A
        else if (percentage >= 60) return 3; // B
        else if (percentage >= 40) return 4; // C
        else return 5; // Fail
    }

    // Convert grade code to string
    public static String getGrade(int code) {

        switch (code) {
            case 1: return "A+";
            case 2: return "A";
            case 3: return "B";
            case 4: return "C";
            default: return "Fail";
        }
    }

    // Display scorecard
    public static void display(int[][] scores, double[][] results) {

        System.out.println("Student\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int) results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "\t" +
                    getGrade((int) results[i][3])
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);

        display(scores, results);

        sc.close();
    }
}