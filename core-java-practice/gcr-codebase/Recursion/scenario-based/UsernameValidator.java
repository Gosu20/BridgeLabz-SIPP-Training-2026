import java.util.Scanner;

public class UsernameValidator {

    public static boolean isValidUsername(
            String username,
            int index) {

        if (index == username.length()) {
            return true;
        }

        char character =
                username.charAt(index);

        if (character < 'a'
                || character > 'z') {

            return false;
        }

        return isValidUsername(
                username,
                index + 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.println(
                isValidUsername(username, 0));

        scanner.close();
    }
}