
public class  inverted_right_triangle{
    public static void main(String[] args) {
    int[] testcases={3,4};
    for(int n : testcases){
        System.out.println("Pattern for n="+n);
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }System.out.println();
    }

    }}