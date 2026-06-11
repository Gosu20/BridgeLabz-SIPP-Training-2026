import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }

        input.close();
    }
}