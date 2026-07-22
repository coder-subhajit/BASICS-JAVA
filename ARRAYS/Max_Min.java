import java.util.Scanner;
public class Max_Min {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=x.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter "+n+" elements of the array:");
        for(int i=0;i<n;i++){
          nums[i]=x.nextInt();  
        }
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<n;i++){
        if(nums[i]<min){
            min=nums[i];
        } 
        if(nums[i]>max){
            max=nums[i];
        }}
         System.out.println("The minimum element is "+min);
         System.out.println("The maximum element is "+max);
    
}
}