public class subha {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter year: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        int year = sc.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + (isLeap ? " is a leap year." : " is not a leap year."));
        sc.close();
    }
}