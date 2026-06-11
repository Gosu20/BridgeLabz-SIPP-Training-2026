import java.util.Scanner;

public class UniqueFrequency {

    public static char[] unique(String text) {

        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            boolean found = false;

            for (int j = 0; j < index; j++) {
                if (temp[j] == text.charAt(i)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[index++] = text.charAt(i);
            }
        }

        char[] result = new char[index];

        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static String[][] frequency(String text, char[] unique) {

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {

            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == unique[i]) {
                    count++;
                }
            }

            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(count);
        }

        return result;
    }

    public static void display(String[][] data) {

        System.out.println("Char\tFreq");

        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char[] unique = unique(text);
        display(frequency(text, unique));

        sc.close();
    }
}