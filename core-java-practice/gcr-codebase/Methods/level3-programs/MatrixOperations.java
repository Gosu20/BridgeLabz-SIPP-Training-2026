import java.util.Random;

public class MatrixOperations {

    public static int[][] createRandomMatrix(int rows, int columns) {

        Random random = new Random();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                matrix[i][j] = random.nextInt(10);
            }
        }

        return matrix;
    }

    public static int[][] addMatrices(
            int[][] matrix1,
            int[][] matrix2) {

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] result =
                new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                result[i][j] =
                        matrix1[i][j]
                                + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] subtractMatrices(
            int[][] matrix1,
            int[][] matrix2) {

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] result =
                new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                result[i][j] =
                        matrix1[i][j]
                                - matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(
            int[][] matrix1,
            int[][] matrix2) {

        int rows = matrix1.length;
        int columns = matrix2[0].length;

        int[][] result =
                new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                for (int k = 0; k < matrix2.length; k++) {

                    result[i][j] +=
                            matrix1[i][k]
                                    * matrix2[k][j];
                }
            }
        }

        return result;
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

    public static void main(String[] args) {

        int rows = 3;
        int columns = 3;

        int[][] matrix1 =
                createRandomMatrix(rows, columns);

        int[][] matrix2 =
                createRandomMatrix(rows, columns);

        System.out.println("Matrix 1");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2");
        displayMatrix(matrix2);

        System.out.println("\nAddition");
        displayMatrix(
                addMatrices(matrix1, matrix2));

        System.out.println("\nSubtraction");
        displayMatrix(
                subtractMatrices(matrix1, matrix2));

        System.out.println("\nMultiplication");
        displayMatrix(
                multiplyMatrices(matrix1, matrix2));
    }
}