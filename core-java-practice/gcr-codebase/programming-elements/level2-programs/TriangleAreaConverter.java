import java.util.Scanner;

class TriangleAreaConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaInSqCm = 0.5 * base * height;

        double areaInSqInches = areaInSqCm / (2.54 * 2.54);

        System.out.println(
                "The Area of the triangle in sq in is "
                        + areaInSqInches +
                        " and sq cm is "
                        + areaInSqCm
        );

        input.close();
    }
}