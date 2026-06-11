import java.util.Scanner;

public class LowerCaseConverter {

    public static String convertToLowerCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            if (character >= 'A' && character <= 'Z') {
                character = (char) (character + 32);
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

        String customLowerCase = convertToLowerCase(text);
        String builtInLowerCase = text.toLowerCase();

        System.out.println("Custom Result: " + customLowerCase);
        System.out.println("Built-in Result: " + builtInLowerCase);

        System.out.println("Both Same: "
                + compareStrings(customLowerCase, builtInLowerCase));

        input.close();
    }
}