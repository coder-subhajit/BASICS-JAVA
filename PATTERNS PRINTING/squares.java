import java.util.Scanner;
public class squares {
    public static void main(String[] args){
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row=sc.nextInt();
        System.out.println("Enter the number of column:");
         int col=sc.nextInt();
        for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
            System.out.print("* ");
        } System.out.println();
      }
    }
    
}
