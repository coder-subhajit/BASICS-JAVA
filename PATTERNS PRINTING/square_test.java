import java.util.Scanner;

public class square_test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of test cases:");
        int t=sc.nextInt();
            System.out.println("Enter the size of the square:");
        while(t>0){
         int n=sc.nextInt();
         for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print("* ");
            }
             System.out.println( );
             
         }System.out.println();
         t--;
        }
         }}


    
    
