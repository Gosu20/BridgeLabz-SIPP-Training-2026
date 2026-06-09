import java.util.Scanner;

class DistanceConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distanceInFeet = input.nextDouble();

        double distanceInYards =
                distanceInFeet / 3;

        double distanceInMiles =
                distanceInYards / 1760;

        System.out.println(
                "Distance in yards is " +
                        distanceInYards +
                        " and distance in miles is " +
                        distanceInMiles
        );

        input.close();
    }
}