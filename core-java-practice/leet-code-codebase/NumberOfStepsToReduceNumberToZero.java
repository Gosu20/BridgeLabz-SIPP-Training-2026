public class NumberOfStepsToReduceNumberToZero {

    public int numberOfSteps(int num) {

        int steps = 0;

        while (num > 0) {

            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }

            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {

        NumberOfStepsToReduceNumberToZero solution =
                new NumberOfStepsToReduceNumberToZero();

        int result = solution.numberOfSteps(14);

        System.out.println("Number of Steps = " + result);
    }
}