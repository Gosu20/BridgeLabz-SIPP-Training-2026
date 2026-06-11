import java.util.Scanner;

class TrimWithoutTrim {

    public static int[] findBounds(String text) {

        int start = 0, end = text.length() - 1;

        while (start < text.length() && text.charAt(start) == ' ') start++;
        while (end >= 0 && text.charAt(end) == ' ') end--;

        return new int[]{start, end};
    }

    public static String substring(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] bounds = findBounds(text);

        String manual = substring(text, bounds[0], bounds[1]);
        String built = text.trim();

        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + built);
        System.out.println("Equal: " + compare(manual, built));

        sc.close();
    }
}