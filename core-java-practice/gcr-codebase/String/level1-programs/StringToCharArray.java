import java.util.Scanner;

public class StringToCharArray {

    public static char[] getCharacters(String text) {

        char[] characters = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }

        return characters;
    }

    public static boolean compareArrays(char[] first, char[] second) {

        if (first.length != second.length) {
            return false;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = input.next();

        char[] customArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        System.out.println("Arrays Equal: "
                + compareArrays(customArray, builtInArray));

        input.close();
    }
}