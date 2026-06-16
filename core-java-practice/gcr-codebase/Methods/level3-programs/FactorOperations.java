import java.util.Scanner;

public class FactorOperations {

    public static int[] findFactors(int number) {

        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int findSum(int[] factors) {

        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    public static long findProduct(int[] factors) {

        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    public static double findProductOfCubes(int[] factors) {

        double product = 1;

        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }

        return product;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");

        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println("\nGreatest Factor: " +
                findGreatestFactor(factors));

        System.out.println("Sum: " +
                findSum(factors));

        System.out.println("Product: " +
                findProduct(factors));

        System.out.println("Product Of Cubes: " +
                findProductOfCubes(factors));

        scanner.close();
    }
}