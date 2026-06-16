import java.util.Scanner;

public class NumberCheckerAdvanced2 {

    public static int countDigits(int number) {

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int[] getDigits(int number, int count) {

        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int findSum(int[] digits) {

        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    public static double findSumOfSquares(int[] digits) {

        double sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }

        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        return number % findSum(digits) == 0;
    }

    public static int[][] findFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int[] digits = getDigits(number, countDigits(number));

        System.out.println("Sum = " + findSum(digits));
        System.out.println("Sum of Squares = " + findSumOfSquares(digits));
        System.out.println("Harshad Number = " + isHarshadNumber(number, digits));

        int[][] frequency = findFrequency(digits);

        System.out.println("\nDigit Frequency");

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + frequency[i][1]);
        }

        scanner.close();
    }
}