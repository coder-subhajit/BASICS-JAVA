public class Alphabet_inc_char_dec_Triangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            char ch=(char)('A'+5-i);
            for(int j=1;j<=i;j++){
                System.out.print(ch+++" ");
            }
            System.out.println();
        }
    }
}
