//using brute force approach  

import java.util.Arrays;
import java.util.Scanner;
public class Merge_Sorted_Array {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the size of the first array:");
        int n1=x.nextInt();
        System.out.print("Enter the size of the second array:");
        int n2=x.nextInt();

        int[] nums1=new int[n1];
        int[] nums2=new int[n2];

        System.out.print("Enter "+n1+" the elements of the first array:");
        for(int i=0;i<n1;i++){
         nums1[i]=x.nextInt();
        }
         System.out.print("Enter "+n2+" the elements of the second array:");
        for(int i=0;i<n2;i++){
         nums2[i]=x.nextInt();
        }
        int[] merge=new int[n1+n2];
        for(int i=0;i<n1;i++){
            merge[i]=nums1[i]; 
        }
        for(int i=0;i<n2;i++){
            merge[n1+i]=nums2[i];
        }
        Arrays.sort(merge);
         System.out.print("The Merge Sorted Array:");
        for(int i=0;i<n1+n2;i++){
          System.out.print(merge[i]+" ");
        }
    }
}