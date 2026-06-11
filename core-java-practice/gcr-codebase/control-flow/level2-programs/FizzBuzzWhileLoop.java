import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int counter = 1;

        while (counter <= number) {
            if (counter % 3 == 0 && counter % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (counter % 3 == 0) {
                System.out.println("Fizz");
            } else if (counter % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(counter);
            }

            counter++;
        }

        input.close();
    }
}