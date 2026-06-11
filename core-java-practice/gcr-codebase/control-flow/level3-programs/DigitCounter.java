import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int count = 0;

        number = Math.abs(number);

        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                count++;
                number = number / 10;
            }
        }

        System.out.println("Number of digits = " + count);

        input.close();
    }
}