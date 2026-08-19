public class Palindromic_Alphabet_Triangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            //print spaces
            for(int j=1;j<5-i;j++){
                System.out.print(" ");
            }
            //increasing alphabet
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch++);
            }
            //decreasing alphabet
            ch-=2;
            for(int j=1;j<i;j++){
                System.out.print(ch--);
            }
            System.out.println();
        }
    }
}
