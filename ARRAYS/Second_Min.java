import java.util.Scanner;
public class Second_Min {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=x.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter "+n+" the elements of the array:");
        for(int i=0;i<n;i++){
         nums[i]=x.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int Sec_min = Integer.MAX_VALUE;
         for(int i=0;i<n;i++){
            if(nums[i]<min){
                Sec_min=min;
                min=nums[i];
        }else if(nums[i]<Sec_min&&nums[i]!=min){
             Sec_min=nums[i];
        }
} System.out.println("The Second Minimum element is "+Sec_min);
    }
}