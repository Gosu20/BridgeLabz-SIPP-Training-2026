import java.util.Scanner;

public class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " occurs " +
                        frequency[i] + " times");
            }
        }

        input.close();
    }
}