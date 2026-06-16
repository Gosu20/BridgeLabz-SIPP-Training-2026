import java.util.Scanner;

public class StringPermutations {

    public static void generatePermutations(
            String text,
            String permutation) {

        if (text.length() == 0) {

            System.out.println(permutation);
            return;
        }

        for (int i = 0;
             i < text.length();
             i++) {

            char currentCharacter =
                    text.charAt(i);

            String remainingString =
                    text.substring(0, i)
                            + text.substring(i + 1);

            generatePermutations(
                    remainingString,
                    permutation + currentCharacter);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = scanner.nextLine();

        generatePermutations(text, "");

        scanner.close();
    }
}