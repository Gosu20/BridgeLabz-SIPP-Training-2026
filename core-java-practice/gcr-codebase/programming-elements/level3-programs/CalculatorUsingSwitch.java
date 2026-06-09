import java.util.Scanner;

class CalculatorUsingSwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        String operator = input.next();

        switch (operator) {

            case "+":
                System.out.println(firstNumber + secondNumber);
                break;

            case "-":
                System.out.println(firstNumber - secondNumber);
                break;

            case "*":
                System.out.println(firstNumber * secondNumber);
                break;

            case "/":
                System.out.println(firstNumber / secondNumber);
                break;

            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}