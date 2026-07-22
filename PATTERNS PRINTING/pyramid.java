import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the no of terms:");
        int n=x.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            } System.out.println();
        }
    }
    
}
