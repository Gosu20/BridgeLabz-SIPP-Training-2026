import java.util.Scanner;

public class NaturalNumberSumWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {

            int sumUsingLoop = 0;
            int counter = 1;

            while (counter <= number) {

                sumUsingLoop += counter;
                counter++;
            }

            int sumUsingFormula = number * (number + 1) / 2;

            System.out.println("Sum using while loop = " + sumUsingLoop);
            System.out.println("Sum using formula = " + sumUsingFormula);
            System.out.println("Both results are equal: "
                    + (sumUsingLoop == sumUsingFormula));

        } else {

            System.out.println("The number is not a natural number");
        }

        input.close();
    }
}