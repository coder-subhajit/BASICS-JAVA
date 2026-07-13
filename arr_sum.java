//The sum of 1D array
    import java.util.Scanner;
public class arr_sum{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int arr[]=new int[n] ;
    System.out.println("Enter the "+n+" elements:");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();}
        int sum=0;
        for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    for(int i=0;i<arr.length;i++){
          System.out.println("Array elements are: arr[" + i + "] = " + arr[i]);
}
        System.out.println("The sum of the elements are:"+sum);
     sc.close();

    
    }
}
