import java.util.Scanner;
public class Longest_Substring {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=x.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter "+n+" the elements of the array:");
        for(int i=0;i<n;i++){
         nums[i]=x.nextInt();
        }


    }
}
