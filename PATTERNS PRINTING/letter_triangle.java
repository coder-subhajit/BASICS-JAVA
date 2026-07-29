import java.util.Scanner;
public class letter_triangle {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the no of terms:");
        int n=x.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                char ch=(char) (64+j);
                System.out.print(ch+" ");
            } System.out.println();
        }
    }
}   