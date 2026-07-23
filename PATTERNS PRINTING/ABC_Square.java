import java.util.Scanner;
public class ABC_Square {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int rows=sc.nextInt();
    System.out.println("Enter the number of columns:");
    int cols=sc.nextInt();
    
    for(int i=1;i<=rows;i++){
      char ch='A';
        for(int j=1;j<=cols;j++){
            System.out.print(" "+ch);
            ch++;
        }System.out.println();
    }
 }   
}
 
