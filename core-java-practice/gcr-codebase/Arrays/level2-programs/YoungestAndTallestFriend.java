import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Friend names
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input
        for (int i = 0; i < friends.length; i++) {

            System.out.println("\nEnter details for " + friends[i]);

            System.out.print("Age: ");
            ages[i] = input.nextInt();

            System.out.print("Height (in cm): ");
            heights[i] = input.nextDouble();

            // Validation
            if (ages[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input! Enter again.");
                i--;
            }
        }

        // Find youngest friend
        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find tallest friend
        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nYoungest Friend: " +
                friends[youngestIndex] +
                " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest Friend: " +
                friends[tallestIndex] +
                " (Height: " + heights[tallestIndex] + " cm)");

        input.close();
    }
}