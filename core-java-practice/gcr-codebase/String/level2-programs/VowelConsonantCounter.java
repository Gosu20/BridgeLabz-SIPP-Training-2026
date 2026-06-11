import java.util.Scanner;

class VowelConsonantCounter {

    public static String checkChar(char ch) {

        ch = Character.toLowerCase(ch);

        if (!Character.isLetter(ch)) return "Not Letter";

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return "Vowel";

        return "Consonant";
    }

    public static int[] countVC(String text) {

        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            String result = checkChar(text.charAt(i));

            if (result.equals("Vowel")) vowels++;
            else if (result.equals("Consonant")) consonants++;
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] result = countVC(text);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        sc.close();
    }
}