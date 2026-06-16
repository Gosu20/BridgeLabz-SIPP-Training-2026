import java.util.Scanner;

public class SumNaturalNumbersRecursion {

    public static int findSum(int number) {

        if (number == 1) {
            return 1;
        }

        return number + findSum(number - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int number = scanner.nextInt();

        System.out.println("Sum = " + findSum(number));

        scanner.close();
    }
}