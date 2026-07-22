import java.util.Scanner;

public class array_search {

    public void searching() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                System.out.println("Number found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found.");
        }

        sc.close();
    }

    public static void main(String[] args) {
        array_search obj = new array_search();
        obj.searching();
    }
}