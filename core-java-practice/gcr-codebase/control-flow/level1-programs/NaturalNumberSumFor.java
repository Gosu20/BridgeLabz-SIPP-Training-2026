import java.util.Scanner;

public class NaturalNumberSumFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {

            int sumUsingLoop = 0;

            for (int i = 1; i <= number; i++) {

                sumUsingLoop += i;
            }

            int sumUsingFormula = number * (number + 1) / 2;

            System.out.println("Sum using for loop = " + sumUsingLoop);
            System.out.println("Sum using formula = " + sumUsingFormula);
            System.out.println("Both results are equal: "
                    + (sumUsingLoop == sumUsingFormula));

        } else {

            System.out.println("The number is not a natural number");
        }

        input.close();
    }
}