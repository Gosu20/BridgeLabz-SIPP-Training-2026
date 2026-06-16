import java.util.Random;

public class MatrixAdvancedOperations {

    public static int[][] createRandomMatrix(
            int rows,
            int columns) {

        Random random = new Random();

        int[][] matrix =
                new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                matrix[i][j] =
                        random.nextInt(9) + 1;
            }
        }

        return matrix;
    }

    public static int[][] transposeMatrix(
            int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose =
                new int[columns][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                transpose[j][i] =
                        matrix[i][j];
            }
        }

        return transpose;
    }

    public static int determinant2x2(
            int[][] matrix) {

        return (matrix[0][0] * matrix[1][1])
                - (matrix[0][1] * matrix[1][0]);
    }

    public static int determinant3x3(
            int[][] matrix) {

        return matrix[0][0]
                * ((matrix[1][1] * matrix[2][2])
                - (matrix[1][2] * matrix[2][1]))

                - matrix[0][1]
                * ((matrix[1][0] * matrix[2][2])
                - (matrix[1][2] * matrix[2][0]))

                + matrix[0][2]
                * ((matrix[1][0] * matrix[2][1])
                - (matrix[1][1] * matrix[2][0]));
    }

    public static double[][] inverse2x2(
            int[][] matrix) {

        int determinant =
                determinant2x2(matrix);

        double[][] inverse =
                new double[2][2];

        inverse[0][0] =
                matrix[1][1]
                        / (double) determinant;

        inverse[0][1] =
                -matrix[0][1]
                        / (double) determinant;

        inverse[1][0] =
                -matrix[1][0]
                        / (double) determinant;

        inverse[1][1] =
                matrix[0][0]
                        / (double) determinant;

        return inverse;
    }

    public static void displayMatrix(
            int[][] matrix) {

        for (int[] row : matrix) {

            for (int value : row) {

                System.out.print(value + "\t");
            }

            System.out.println();
        }
    }

    public static void displayDoubleMatrix(
            double[][] matrix) {

        for (double[] row : matrix) {

            for (double value : row) {

                System.out.printf("%.2f\t",
                        value);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix2x2 =
                createRandomMatrix(2, 2);

        System.out.println("2x2 Matrix");
        displayMatrix(matrix2x2);

        System.out.println(
                "\nTranspose");

        displayMatrix(
                transposeMatrix(matrix2x2));

        System.out.println(
                "\nDeterminant = "
                        + determinant2x2(matrix2x2));

        System.out.println(
                "\nInverse");

        displayDoubleMatrix(
                inverse2x2(matrix2x2));

        int[][] matrix3x3 =
                createRandomMatrix(3, 3);

        System.out.println(
                "\n3x3 Matrix");

        displayMatrix(matrix3x3);

        System.out.println(
                "\nTranspose");

        displayMatrix(
                transposeMatrix(matrix3x3));

        System.out.println(
                "\nDeterminant = "
                        + determinant3x3(matrix3x3));
    }
}