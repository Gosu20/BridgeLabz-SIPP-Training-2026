import java.util.Scanner;

class HandshakeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfStudents = input.nextInt();

        int totalHandshakes =
                (numberOfStudents *
                        (numberOfStudents - 1)) / 2;

        System.out.println(
                "Maximum number of handshakes possible are "
                        + totalHandshakes
        );

        input.close();
    }
}