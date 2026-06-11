import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

   
    public static void handleException(String text) {

        try {
            
            char character = text.charAt(text.length());

            System.out.println("Character: " + character);

        } catch (StringIndexOutOfBoundsException exception) {

            System.out.println("StringIndexOutOfBoundsException Handled");

        } catch (RuntimeException exception) {

            System.out.println("Runtime Exception Handled");
        }
    }

    public static void main(String[] args) {

       
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String text = input.nextLine();

       
        handleException(text);


        input.close();
    }
}