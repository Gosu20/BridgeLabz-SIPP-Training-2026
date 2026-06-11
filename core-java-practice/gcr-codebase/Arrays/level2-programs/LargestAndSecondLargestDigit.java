import java.util.Scanner;

public class LargestAndSecondLargestDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Invalid Input! Enter a positive number.");
            input.close();
            return;
        }

        // Array size for maximum 10 digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Index to track array position
        int index = 0;

        // Store digits in array
        while (number != 0) {

            digits[index] = number % 10;
            number = number / 10;

            index++;

            // Stop if array becomes full
            if (index == maxDigit) {
                break;
            }
        }

        // Variables to store largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display digits
        System.out.print("Digits: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest Digit = " + largest);

        if (secondLargest != -1) {
            System.out.println("Second Largest Digit = " + secondLargest);
        } else {
            System.out.println("Second Largest Digit not found");
        }

        input.close();
    }
}