import java.util.*;
public class Linear_Search {
    public static int linearsearch(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        } return -1;
    }
public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=x.nextInt();
    int[] nums=new int[n];
    System.out.println("Enter "+n+" elements of the array:");
    for(int i=0;i<n;i++){
        nums[i]=x.nextInt();
    } 
    System.out.println("Enter the target:");
    int target=x.nextInt();
    int result=linearsearch(nums,target);
    if(result!=-1){
        System.out.println("Found at Index: "+result);
    }else{
        System.out.println("Not Found...");
    }
}
}
