import java.util.Scanner;

public class NumberCheckerAdvanced1 {

    public static int countDigits(int number) {

        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
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

    public static boolean isDuckNumber(int[] digits) {

        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {

        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += (int) Math.pow(digit, power);
        }

        return sum == number;
    }

    public static int[] largestAndSecondLargest(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    public static int[] smallestAndSecondSmallest(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        int count = countDigits(number);
        int[] digits = getDigits(number, count);

        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrongNumber(number, digits));

        int[] largest = largestAndSecondLargest(digits);
        int[] smallest = smallestAndSecondSmallest(digits);

        System.out.println("Largest = " + largest[0]);
        System.out.println("Second Largest = " + largest[1]);

        System.out.println("Smallest = " + smallest[0]);
        System.out.println("Second Smallest = " + smallest[1]);

        scanner.close();
    }
}