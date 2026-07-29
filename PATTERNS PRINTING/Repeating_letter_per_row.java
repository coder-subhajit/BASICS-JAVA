import java.util.Scanner;
public class Repeating_letter_per_row {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the no of terms:");
        int n=x.nextInt();
        for(int i=1;i<=n;i++){
            char ch=(char)(64+i);
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }System.out.println();
        }
    }
}
