import java.util.Scanner;

class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        input.close();
    }
}