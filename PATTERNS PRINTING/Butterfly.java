public class Butterfly {
    public static void main(String[] args) {
    //upper part    
        for(int i=1;i<=5;i++){
            //left stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //middle spaces
            for(int j=1;j<=2*(5-i);j++){
                System.out.print(" ");
            }
            //right stars
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    //lower part
    for(int i=5-1;i>=1;i--){
        //left stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //middle spaces
        for(int j=1;j<=2*(5-i);j++){
            System.out.print(" ");
        }
        //right stars
        for(int j=i;j>=1;j--){
            System.out.print("*");
        }
        System.out.println();
    }    
    }
}
