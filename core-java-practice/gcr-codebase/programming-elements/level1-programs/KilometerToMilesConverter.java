class KilometerToMilesConverter {
    public static void main(String[] args) {

        double distanceInKilometers = 10.8;

        double distanceInMiles = distanceInKilometers / 1.6;

        System.out.println("The distance " +
                distanceInKilometers +
                " km in miles is " +
                distanceInMiles);
    }
}