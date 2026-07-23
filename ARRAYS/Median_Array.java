import java.util.*;
public class Median_Array {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=x.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter "+n+" the elements of the array:");
        for(int i=0;i<n;i++){
         nums[i]=x.nextInt();
        }
        Median_Array obj=new Median_Array();
        double ans=obj.median(nums);
        System.out.println("Median= "+ans);
    }
       public double median(int[] nums){
        int len=nums.length;
        if(len%2==0){
            return (nums[len/2-1]+nums[len/2])/2.0;
        }else{
            return (nums[len/2]);
        }
       }
}
