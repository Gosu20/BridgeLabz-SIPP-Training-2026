import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {

        if (number1 > number2) {
            return 1;
        }

        if (number1 < number2) {
            return -1;
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (isPositive(numbers[i])) {

                if (isEven(numbers[i])) {
                    System.out.println("Positive Even");
                } else {
                    System.out.println("Positive Odd");
                }

            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);

        if (result == 1) {
            System.out.println("First Number is Greater");
        } else if (result == -1) {
            System.out.println("Last Number is Greater");
        } else {
            System.out.println("Both Numbers are Equal");
        }

        scanner.close();
    }
}