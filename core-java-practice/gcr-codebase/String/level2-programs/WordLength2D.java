import java.util.Scanner;

class WordLength2D {

    public static String[] splitWords(String text) {

        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }

        String[] words = new String[count];
        int start = 0, index = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        return words;
    }

    public static String[][] buildTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(words[i].length());
        }

        return table;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = buildTable(words);

        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        sc.close();
    }
}