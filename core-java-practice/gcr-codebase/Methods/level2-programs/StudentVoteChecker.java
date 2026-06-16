import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int age) {

        if (age < 0) {
            return false;
        }

        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter Age of Student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();

            if (canStudentVote(ages[i])) {
                System.out.println("Can Vote");
            } else {
                System.out.println("Cannot Vote");
            }
        }

        scanner.close();
    }
}