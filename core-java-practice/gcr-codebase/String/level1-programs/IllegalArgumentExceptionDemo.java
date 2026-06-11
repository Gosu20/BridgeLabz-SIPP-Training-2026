import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to handle exception
    public static void handleException(String text) {

        try {

            String result = text.substring(5, 2);

            System.out.println(result);

        } catch (IllegalArgumentException exception) {

            System.out.println("IllegalArgumentException Handled");

        } catch (RuntimeException exception) {

            System.out.println("Runtime Exception Handled");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = input.nextLine();

        handleException(text);

        input.close();
    }
}