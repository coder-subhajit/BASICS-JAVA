public class left_triangle {
    public static void main(String[] args) {
        int[] testcases={3,4};
        for(int n : testcases){
            System.out.println("Pattern for n="+n);
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }for(int k=1;k<=i;k++){
                    System.out.print("*");
                } System.out.println();
            }
        }
    }
}
