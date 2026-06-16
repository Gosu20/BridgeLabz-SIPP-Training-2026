import java.util.Scanner;

public class RecursiveNaturalNumberSum {

    public static int findSumUsingRecursion(int number) {

        if (number == 1) {
            return 1;
        }

        return number + findSumUsingRecursion(number - 1);
    }

    public static int findSumUsingFormula(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Natural Number: ");
        int number = scanner.nextInt();

        int recursiveSum = findSumUsingRecursion(number);
        int formulaSum = findSumUsingFormula(number);

        System.out.println("Recursive Sum = " + recursiveSum);
        System.out.println("Formula Sum = " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both Results Match");
        }

        scanner.close();
    }
}