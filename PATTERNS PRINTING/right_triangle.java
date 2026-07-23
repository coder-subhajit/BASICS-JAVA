
public class right_triangle {
    public static void main(String[] args) {

        int[] testCases = {3, 4}; // Default test cases using an array

        for (int n : testCases) {

            System.out.println("Pattern for n = " + n);

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
