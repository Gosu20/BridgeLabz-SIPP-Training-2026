import java.util.Scanner;

public class NullPointerExceptionDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter any text: ");
            String text = input.nextLine();

            text = null;

            System.out.println(text.length());

        } catch (NullPointerException e) {
            System.out.println("NullPointerException Handled");
        }

        input.close();
    }
}