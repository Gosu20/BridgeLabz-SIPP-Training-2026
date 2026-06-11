public class RaviWelcomeCard {

    public static void main(String[] args) {

        String employeeName = "Ravi";
        int employeeAge = 22;
        char employeeRank = 'A';
        double employeeSalary = 50000.0;
        float membershipFee = 1500.50f;

        double annualBonus = employeeSalary * 0.12;
        int bonusAmount = (int) annualBonus;

        System.out.println("********************************");
        System.out.println("      WELCOME TO CODING GUILD");
        System.out.println("********************************");
        System.out.println("Name           : " + employeeName);
        System.out.println("Age            : " + employeeAge);
        System.out.println("Rank           : " + employeeRank);
        System.out.println("Salary         : " + employeeSalary);
        System.out.println("Membership Fee : " + membershipFee);
        System.out.println("Annual Bonus   : " + bonusAmount);
        System.out.println("********************************");
    }
}