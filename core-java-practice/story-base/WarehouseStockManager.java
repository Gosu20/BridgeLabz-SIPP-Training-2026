public class WarehouseStockManager {

    public static void main(String[] args) {

        int[] stock = {50, 30, 70, 20, 50, 90, 30};

        int maxStock = stock[0];
        int minStock = stock[0];
        int totalStock = 0;

        for (int i = 0; i < stock.length; i++) {

            if (stock[i] > maxStock) {
                maxStock = stock[i];
            }

            if (stock[i] < minStock) {
                minStock = stock[i];
            }

            totalStock += stock[i];
        }

        System.out.println("Maximum Stock: " + maxStock);
        System.out.println("Minimum Stock: " + minStock);
        System.out.println("Total Stock: " + totalStock);

        System.out.println("\nDuplicate Stock Quantities:");

        boolean duplicateFound = false;

        for (int i = 0; i < stock.length; i++) {

            for (int j = i + 1; j < stock.length; j++) {

                if (stock[i] == stock[j]) {
                    System.out.println(stock[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicates Found");
        }

        int k = 2;

        int[] rotatedStock = new int[stock.length];

        for (int i = 0; i < stock.length; i++) {
            rotatedStock[(i + k) % stock.length] = stock[i];
        }

        System.out.println("\nRotated Stock Array:");

        for (int value : rotatedStock) {
            System.out.print(value + " ");
        }

        System.out.println();

        int[][] shelfGrid = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int rows = shelfGrid.length;
        int columns = shelfGrid[0].length;

        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                transpose[j][i] = shelfGrid[i][j];
            }
        }

        System.out.println("\nTransposed Shelf Grid:");

        for (int i = 0; i < transpose.length; i++) {

            for (int j = 0; j < transpose[i].length; j++) {

                System.out.print(transpose[i][j] + " ");
            }

            System.out.println();
        }
    }
}