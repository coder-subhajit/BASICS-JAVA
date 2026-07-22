import java.util.Scanner;
public class Second_Large {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=x.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter "+n+" the elements of the array:");
        for(int i=0;i<n;i++){
         nums[i]=x.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
      if (nums[i]>max){
        secondMax=max;
        max=nums[i];
    }
    else if(nums[i]>secondMax&&nums[i] != max) {
        secondMax=nums[i];
    }
} System.out.println("The Second Maximum Element is "+secondMax);
    }
}
