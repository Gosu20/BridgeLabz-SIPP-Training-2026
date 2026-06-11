import java.util.Scanner;

public class FactorialFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {

            long factorial = 1;

            for (int i = 1; i <= number; i++) {

                factorial *= i;
            }

            System.out.println("Factorial of "
                    + number + " = " + factorial);

        } else {

            System.out.println("The number is not a natural number");
        }

        input.close();
    }
}