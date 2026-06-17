public class MathWizard {

    int instanceVariable = 100;

    public boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public long factorial(int n) {

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public double factorial(double n) {

        double result = 1;

        for (int i = 1; i <= (int) n; i++) {
            result *= i;
        }

        return result;
    }

    public int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        int first = 0;
        int second = 1;

        for (int i = 2; i <= n; i++) {

            int next = first + second;

            first = second;
            second = next;
        }

        return second;
    }

    public int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }

    public long power(
            int base,
            int exp) {

        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    public void demonstrateScope() {

        int localVariable = 50;

        System.out.println(
                "Local Variable: "
                        + localVariable);

        System.out.println(
                "Instance Variable: "
                        + instanceVariable);
    }

    public static void main(String[] args) {

        MathWizard wizard = new MathWizard();

        System.out.println(
                "Prime: "
                        + wizard.isPrime(17));

        System.out.println(
                "Factorial(int): "
                        + wizard.factorial(5));

        System.out.println(
                "Factorial(double): "
                        + wizard.factorial(5.0));

        System.out.println(
                "Fibonacci: "
                        + wizard.fibonacci(8));

        System.out.println(
                "GCD: "
                        + wizard.gcd(12, 18));

        System.out.println(
                "LCM: "
                        + wizard.lcm(12, 18));

        System.out.println(
                "Power: "
                        + wizard.power(2, 5));

        wizard.demonstrateScope();
    }
}