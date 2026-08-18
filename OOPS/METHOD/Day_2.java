//Method that returns a value
//Instead of printing the result, a method can return it.
public class Day_2 {
  int add(int a,int b){
    return a+b;
  }
  public static void main(String[] args) {
      Day_2 c = new Day_2();
      int result=c.add(10,20);
      System.out.println(result);
  }
}
