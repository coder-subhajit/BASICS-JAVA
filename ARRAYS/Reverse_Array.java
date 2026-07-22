import java.util.Scanner;
public class Reverse_Array {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=x.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter "+n+" the elements of the array:");
        for(int i=0;i<n;i++){
         nums[i]=x.nextInt();
        }
        //USING TWO POINTER APPROACH
       int left=0;
       int right=n-1;
       while(left<right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
           left++;
           right--;   
       } 
       System.out.print("The reverse array is ");
       for(int num : nums){
       System.out.print(num+" ");
    }
}
}