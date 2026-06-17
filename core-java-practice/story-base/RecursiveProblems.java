public class RecursiveProblems {

    static int moveCount = 0;

    public static void towerOfHanoi(
            int n,
            char source,
            char auxiliary,
            char destination) {

        if (n == 1) {

            System.out.println(
                    "Move disk 1 from "
                            + source
                            + " to "
                            + destination);

            moveCount++;

            return;
        }

        towerOfHanoi(
                n - 1,
                source,
                destination,
                auxiliary);

        System.out.println(
                "Move disk "
                        + n
                        + " from "
                        + source
                        + " to "
                        + destination);

        moveCount++;

        towerOfHanoi(
                n - 1,
                auxiliary,
                source,
                destination);
    }

    public static int binarySearch(
            int[] arr,
            int left,
            int right,
            int target) {

        if (left > right) {
            return -1;
        }

        int mid =
                left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {

            return binarySearch(
                    arr,
                    left,
                    mid - 1,
                    target);
        }

        return binarySearch(
                arr,
                mid + 1,
                right,
                target);
    }

    public static int sumOfDigits(int n) {

        if (n == 0) {
            return 0;
        }

        return n % 10 +
                sumOfDigits(n / 10);
    }

    public static String reverseString(
            String str) {

        if (str.isEmpty()) {
            return str;
        }

        return reverseString(
                str.substring(1))
                + str.charAt(0);
    }

    public static boolean isBalanced(
            String str,
            int index,
            int count) {

        if (count < 0) {
            return false;
        }

        if (index == str.length()) {
            return count == 0;
        }

        if (str.charAt(index) == '(') {

            return isBalanced(
                    str,
                    index + 1,
                    count + 1);
        }

        if (str.charAt(index) == ')') {

            return isBalanced(
                    str,
                    index + 1,
                    count - 1);
        }

        return isBalanced(
                str,
                index + 1,
                count);
    }

    public static void main(String[] args) {

        towerOfHanoi(
                3,
                'A',
                'B',
                'C');

        System.out.println(
                "Total Moves: "
                        + moveCount);

        int[] prices =
                {10, 20, 30, 40, 50};

        System.out.println(
                "Binary Search Index: "
                        + binarySearch(
                        prices,
                        0,
                        prices.length - 1,
                        30));

        System.out.println(
                "Sum Of Digits: "
                        + sumOfDigits(1234));

        System.out.println(
                "Reverse String: "
                        + reverseString("Java"));

        System.out.println(
                "Balanced Parentheses: "
                        + isBalanced(
                        "(())()",
                        0,
                        0));
    }
}