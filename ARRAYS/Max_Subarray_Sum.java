import java.util.*;
public class Max_Subarray {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=x.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter "+n+" elements of the array:");
        for(int i=0;i<nums.length;i++){
        nums[i]=x.nextInt();
        }
        System.out.println("The Elements of the Array:");
         for(int num : nums){
            System.out.print(num+" ");
            System.out.println();
        }
        //now i perform task to print subarray
        System.out.println("The Possible Subarrays:");
        for(int start=0;start<nums.length;start++){
          for(int end=start;end<nums.length;end++){
            for(int i=start;i<=end;i++){
                System.out.print(nums[i]);
            }
            System.out.print(" ");
          }System.out.println();
        }
        //find the maximum subarray sum
        Max_Subarray obj=new Max_Subarray();
        int ans=obj.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum= "+ans);
    }
    // now perform max subarray sum using Brute Force(Kadane's Algorithm)
    public int maxSubArray(int[] nums){
        int currentSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
       currentSum=Math.max(nums[i],currentSum+nums[i]);
       maxSum=Math.max(maxSum,currentSum);
        } return maxSum;
    }     
}
