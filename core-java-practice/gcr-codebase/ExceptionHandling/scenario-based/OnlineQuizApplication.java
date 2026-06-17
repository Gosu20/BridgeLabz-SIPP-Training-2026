public class OnlineQuizApplication {

    public static void main(String[] args) {

        String[] answers =
                {"A", "B", "C", "D"};

        for (int i = 0; i <= 5; i++) {

            try {

                if (answers[i].equals("A")) {

                    System.out.println(
                            "Correct at index " + i);
                }

            } catch (
                    ArrayIndexOutOfBoundsException e) {

                System.out.println(
                        "Invalid answer index: "
                                + i);

            } catch (
                    NullPointerException e) {

                System.out.println(
                        "Answer is null at index: "
                                + i);
            }
        }
    }
}