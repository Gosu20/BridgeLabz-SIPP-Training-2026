import java.util.Scanner;

public class CharTypeTable {

    public static String checkChar(char ch) {

        ch = Character.toLowerCase(ch);

        if (!Character.isLetter(ch)) return "Not Letter";

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return "Vowel";

        return "Consonant";
    }

    public static String[][] analyze(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkChar(text.charAt(i));
        }

        return result;
    }

    public static void display(String[][] data) {

        System.out.println("Char\tType");

        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = analyze(text);

        display(result);

        sc.close();
    }
}