import java.util.Scanner;

class USER_INPUT_OUTPUT {
    public void printNumber(Scanner sc) {

        int[] testcases = {1, 2};

        for (int n : testcases) {
            System.out.println("Test Case " + n);

            System.out.print("Enter first number: ");
            int firstInput = sc.nextInt();

            System.out.print("Enter second number: ");
            int secondInput = sc.nextInt();

            System.out.println("First Number: " + firstInput);
            System.out.println("Second Number: " + secondInput);
            System.out.println();
        }
    }
}
