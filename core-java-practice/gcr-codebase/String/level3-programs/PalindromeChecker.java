import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Two pointer
    public static boolean isPalindrome1(String text) {

        int i = 0, j = text.length() - 1;

        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }

    // Logic 2: Recursion
    public static boolean isPalindrome2(String text, int i, int j) {

        if (i >= j) return true;

        if (text.charAt(i) != text.charAt(j)) return false;

        return isPalindrome2(text, i + 1, j - 1);
    }

    // Logic 3: Reverse array
    public static boolean isPalindrome3(String text) {

        char[] original = text.toCharArray();
        char[] reverse = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reverse[i] = original[text.length() - 1 - i];
        }

        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reverse[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Logic 1: " + isPalindrome1(text));
        System.out.println("Logic 2: " + isPalindrome2(text, 0, text.length() - 1));
        System.out.println("Logic 3: " + isPalindrome3(text));

        sc.close();
    }
}