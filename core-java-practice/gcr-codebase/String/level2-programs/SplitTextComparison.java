import java.util.Scanner;
import java.util.Arrays;

class SplitTextComparison {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count++);
            }
        } catch (Exception e) {
            return count - 1;
        }
    }

    public static String[] splitText(String text) {

        int words = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') words++;
        }

        String[] result = new String[words];
        int start = 0, index = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                result[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        return result;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] manual = splitText(text);
        String[] builtIn = text.split(" ");

        System.out.println("Equal: " + compareArrays(manual, builtIn));

        sc.close();
    }
}