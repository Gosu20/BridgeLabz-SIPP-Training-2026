import java.util.Scanner;

public class SubstringUsingCharAt {

    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
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
        String text = input.next();

        System.out.print("Enter Start Index: ");
        int start = input.nextInt();

        System.out.print("Enter End Index: ");
        int end = input.nextInt();

        String customSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        System.out.println("Custom Substring: " + customSubstring);
        System.out.println("Built-in Substring: " + builtInSubstring);

        System.out.println("Same Result: "
                + compareStrings(customSubstring, builtInSubstring));

        input.close();
    }
}