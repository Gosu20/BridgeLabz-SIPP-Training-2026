import java.util.HashMap;

public class SpyAgencyAnalyzer {

    public static String reverse(String str) {

        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    public static boolean isPalindrome(String str) {

        return str.equalsIgnoreCase(reverse(str));
    }

    public static void countVowelsAndConsonants(String str) {

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {

            if (Character.isLetter(ch)) {

                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static boolean areAnagrams(
            String str1,
            String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freq = new int[256];

        for (char ch : str1.toCharArray()) {
            freq[ch]++;
        }

        for (char ch : str2.toCharArray()) {
            freq[ch]--;
        }

        for (int count : freq) {

            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static char firstNonRepeatingCharacter(
            String str) {

        HashMap<Character, Integer> map =
                new HashMap<>();

        for (char ch : str.toCharArray()) {

            map.put(
                    ch,
                    map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {

            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        String message = "madam";

        System.out.println(
                "Reverse: " + reverse(message));

        System.out.println(
                "Palindrome: "
                        + isPalindrome(message));

        countVowelsAndConsonants(
                "SecretMessage");

        System.out.println(
                "Anagram: "
                        + areAnagrams(
                        "listen",
                        "silent"));

        System.out.println(
                "First Non-Repeating Character: "
                        + firstNonRepeatingCharacter(
                        "swiss"));
    }
}