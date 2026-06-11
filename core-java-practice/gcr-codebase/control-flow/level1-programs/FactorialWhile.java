import java.util.Scanner;

public class FactorialWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {

            long factorial = 1;

            int counter = 1;

            while (counter <= number) {

                factorial *= counter;
                counter++;
            }

            System.out.println("Factorial of "
                    + number + " = " + factorial);

        } else {

            System.out.println("The number is not a natural number");
        }

        input.close();
    }
}