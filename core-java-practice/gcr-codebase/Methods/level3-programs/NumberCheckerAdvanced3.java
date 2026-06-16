import java.util.Scanner;
import java.util.Arrays;

public class NumberCheckerAdvanced3 {

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

    public static int[] reverseDigits(int[] digits) {

        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    public static boolean compareArrays(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseDigits(digits));
    }

    public static boolean isDuckNumber(int[] digits) {

        for (int i = 1; i < digits.length; i++) {

            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int[] digits = getDigits(number, countDigits(number));

        System.out.println("Palindrome = " + isPalindrome(digits));
        System.out.println("Duck Number = " + isDuckNumber(digits));

        scanner.close();
    }
}