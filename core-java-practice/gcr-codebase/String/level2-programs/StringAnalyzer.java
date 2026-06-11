import java.util.Scanner;

class StringAnalyzer {

    public static int[] findAllIndexes(String text, char ch) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }

        int[] indexes = new int[count];
        int j = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                indexes[j++] = i;
            }
        }

        return indexes;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a text: ");
            String text = sc.nextLine();

            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);

            int[] result = findAllIndexes(text, ch);

            System.out.println("Indexes:");
            for (int i : result) {
                System.out.print(i + " ");
            }

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

        sc.close();
    }
}