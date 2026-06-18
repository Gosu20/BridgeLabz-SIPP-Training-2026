import java.util.Scanner;

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void makePayment(double billAmount, double availableFunds)
            throws InsufficientFundsException {

        if (availableFunds < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds."
            );
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter total bill amount: ");
            double totalBill = Double.parseDouble(sc.nextLine());

            System.out.print("Enter number of items: ");
            int items = Integer.parseInt(sc.nextLine());

            double costPerItem = totalBill / items;

            System.out.println("Cost per item = " + costPerItem);

            String[] patients =
                    {"Rahul", "Ananya", "Priya"};

            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println(
                    "Patient Name: " + patients[index]
            );

            System.out.print("Enter available funds: ");
            double funds = Double.parseDouble(sc.nextLine());

            makePayment(totalBill, funds);

        }
        catch (ArithmeticException e) {

            System.out.println(
                    "Error: Number of items cannot be zero."
            );
        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Error: Invalid patient index."
            );
        }
        catch (NumberFormatException e) {

            System.out.println(
                    "Error: Please enter valid numeric input."
            );
        }
        catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());
        }
        catch (Exception e) {

            System.out.println(
                    "Unexpected error occurred."
            );
        }

        sc.close();
    }
}