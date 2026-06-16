import java.util.Scanner;

public class ChocolateDistributor {

    public static int[] findRemainderAndQuotient(int chocolates, int children) {

        int chocolatesPerChild = chocolates / children;
        int remainingChocolates = chocolates % children;

        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chocolates = scanner.nextInt();
        int children = scanner.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each Child Gets = " + result[0]);
        System.out.println("Remaining Chocolates = " + result[1]);

        scanner.close();
    }
}