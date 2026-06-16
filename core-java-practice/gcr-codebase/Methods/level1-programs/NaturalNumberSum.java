import java.util.Scanner;

public class NaturalNumberSum {

    public static int findSum(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        System.out.println("Sum = " + findSum(number));

        scanner.close();
    }
}