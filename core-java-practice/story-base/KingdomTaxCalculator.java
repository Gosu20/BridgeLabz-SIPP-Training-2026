import java.util.Scanner;

public class KingdomTaxCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter citizen income: ");
        double income = input.nextDouble();

        double taxRate;
        String taxBracket;

        if (income < 10000) {
            taxRate = 0.05;
            taxBracket = "5% Tax Bracket";
        } else if (income <= 50000) {
            taxRate = 0.15;
            taxBracket = "15% Tax Bracket";
        } else {
            taxRate = 0.30;
            taxBracket = "30% Tax Bracket";
        }

        double taxAmount = income * taxRate;

        System.out.println("Tax Bracket: " + taxBracket);
        System.out.println("Tax Amount: ₹" + taxAmount);

        input.close();
    }
}