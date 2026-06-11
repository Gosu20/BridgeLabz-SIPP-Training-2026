import java.util.Scanner;

public class UpperCaseConverter {

    public static String convertToUpperCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            if (character >= 'a' && character <= 'z') {
                character = (char) (character - 32);
            }

            result += character;
        }

        return result;
    }

    public static boolean compareStrings(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = input.nextLine();

        String customUpperCase = convertToUpperCase(text);
        String builtInUpperCase = text.toUpperCase();

        System.out.println("Custom Result: " + customUpperCase);
        System.out.println("Built-in Result: " + builtInUpperCase);

        System.out.println("Both Same: "
                + compareStrings(customUpperCase, builtInUpperCase));

        input.close();
    }
}