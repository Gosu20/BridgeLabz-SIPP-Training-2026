public class EmployeeBonusCalculator {

    public static double[][] generateEmployeeData(int numberOfEmployees) {

        double[][] employeeData = new double[numberOfEmployees][2];

        for (int i = 0; i < numberOfEmployees; i++) {

            employeeData[i][0] =
                    (int) (Math.random() * 90000) + 10000;

            employeeData[i][1] =
                    (int) (Math.random() * 10) + 1;
        }

        return employeeData;
    }

    public static double[][] calculateBonusAndNewSalary(
            double[][] employeeData) {

        double[][] result =
                new double[employeeData.length][4];

        for (int i = 0; i < employeeData.length; i++) {

            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];

            double bonusPercentage;

            if (yearsOfService > 5) {
                bonusPercentage = 0.05;
            } else {
                bonusPercentage = 0.02;
            }

            double bonusAmount =
                    oldSalary * bonusPercentage;

            double newSalary =
                    oldSalary + bonusAmount;

            result[i][0] = oldSalary;
            result[i][1] = yearsOfService;
            result[i][2] = bonusAmount;
            result[i][3] = newSalary;
        }

        return result;
    }

    public static void displaySummary(double[][] result) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println(
                "OldSalary\tYears\tBonus\tNewSalary");

        for (int i = 0; i < result.length; i++) {

            System.out.printf(
                    "%.2f\t%.0f\t%.2f\t%.2f%n",
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]);

            totalOldSalary += result[i][0];
            totalBonus += result[i][2];
            totalNewSalary += result[i][3];
        }

        System.out.println("\nTotals");

        System.out.printf(
                "Old Salary Total = %.2f%n",
                totalOldSalary);

        System.out.printf(
                "Bonus Total = %.2f%n",
                totalBonus);

        System.out.printf(
                "New Salary Total = %.2f%n",
                totalNewSalary);
    }

    public static void main(String[] args) {

        int numberOfEmployees = 10;

        double[][] employeeData =
                generateEmployeeData(numberOfEmployees);

        double[][] result =
                calculateBonusAndNewSalary(employeeData);

        displaySummary(result);
    }
}