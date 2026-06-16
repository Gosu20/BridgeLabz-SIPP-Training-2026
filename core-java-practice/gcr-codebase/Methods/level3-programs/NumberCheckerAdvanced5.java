import java.util.Scanner;

public class NumberCheckerAdvanced5 {

    public static int findSumOfProperDivisors(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isPerfectNumber(int number) {
        return findSumOfProperDivisors(number) == number;
    }

    public static boolean isAbundantNumber(int number) {
        return findSumOfProperDivisors(number) > number;
    }

    public static boolean isDeficientNumber(int number) {
        return findSumOfProperDivisors(number) < number;
    }

    public static int factorial(int number) {

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }

    public static boolean isStrongNumber(int number) {

        int temp = number;
        int sum = 0;

        while (temp > 0) {

            int digit = temp % 10;
            sum += factorial(digit);

            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        System.out.println("Perfect Number: " + isPerfectNumber(number));
        System.out.println("Abundant Number: " + isAbundantNumber(number));
        System.out.println("Deficient Number: " + isDeficientNumber(number));
        System.out.println("Strong Number: " + isStrongNumber(number));

        scanner.close();
    }
}