import java.util.*;
public class Binary_Search {
    public static int binarysearch(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            } 
        } return -1;
    }
    
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n=x.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter "+n+" elements of the array(Always in sorted order):");
        for(int i=0;i<n;i++){
            nums[i]=x.nextInt();
        }
        System.out.println("Enter the target:");
        int target=x.nextInt();
    
        int result=binarysearch(nums, target);
        if(result!=-1){
            System.out.println("The no is found at index:"+result);
        }else{
            System.out.println("The no is not found...");
        }
    }

    
}
