import java.util.Scanner;

public class StringComparison {

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

        System.out.print("Enter First String: ");
        String firstString = input.next();

        System.out.print("Enter Second String: ");
        String secondString = input.next();

        boolean userResult = compareStrings(firstString, secondString);
        boolean builtInResult = firstString.equals(secondString);

        System.out.println("Using charAt(): " + userResult);
        System.out.println("Using equals(): " + builtInResult);

        input.close();
    }
}