import java.util.Scanner;
public class floyd_triangle {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the no of terms:");
        int n=x.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num++ +" ");
            } System.out.println();
        }
    }
}   