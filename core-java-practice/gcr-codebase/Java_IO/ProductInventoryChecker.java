import java.io.BufferedReader;
import java.io.FileReader;

public class ProductInventoryChecker {

    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("inventory.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split("-");

                String product = parts[0];
                int quantity =
                        Integer.parseInt(parts[1]);

                if (quantity == 0) {

                    System.out.println(
                            product + " is out of stock");
                }
            }

            br.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}