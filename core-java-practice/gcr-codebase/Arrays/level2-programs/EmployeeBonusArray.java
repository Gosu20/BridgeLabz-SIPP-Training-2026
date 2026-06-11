import java.util.Scanner;

public class EmployeeBonusArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < salary.length; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = input.nextDouble();

            System.out.print("Enter Years of Service: ");
            yearsOfService[i] = input.nextDouble();

            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid Input! Enter Again.");
                i--;
                continue;
            }
        }

        for (int i = 0; i < salary.length; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee Salary Details");

        for (int i = 0; i < salary.length; i++) {
            System.out.println(
                    "Employee " + (i + 1) +
                    " | Old Salary = " + salary[i] +
                    " | Bonus = " + bonus[i] +
                    " | New Salary = " + newSalary[i]
            );
        }

        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        input.close();
    }
}