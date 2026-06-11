import java.util.Scanner;

class StudentVotingSystem {

    public static int[] generateAges(int n) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 50);
        }

        return ages;
    }

    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "True" : "False";
        }

        return result;
    }

    public static void display(String[][] data) {

        System.out.println("Age\tCanVote");

        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] result = checkVoting(ages);

        display(result);

        sc.close();
    }
}