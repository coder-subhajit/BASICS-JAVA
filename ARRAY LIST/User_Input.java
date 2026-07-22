import java.util.*;
public class User_Input {
    public static void main(String[] args) {
      ArrayList<Integer>list=new ArrayList<>();
      //ADD ELEMENTS  
      list.add(0);
      list.add(1);
      list.add(2);
      list.add(5);
      System.out.println(list);  

      //ADD ELEMENTS IN SPECIFIC INDEX AND DESIRE VALUE
      list.add(1,4);
      System.out.println(list); 

    //GET ELEMENTS
    int element=list.get(0);
    System.out.println(element);
      element=list.get(3);
      System.out.println(element);//output comes from the updated list
   
    //MODIFY OR CHANGE THE VALUE OF LIST
    list.set(0,9);
    System.out.println(list);

    //DELETE OR REMOVE ELEMENT FROM LIST
    list.remove(0);
    list.remove(2);
    System.out.println(list);

    //FIND THE SIZE OF THE LIST
    int size=list.size();
    System.out.println("The size of the list is:"+size);
     
    //USE LOOPS
    System.out.println("The element of the list is:");
    for(int i=0;i<list.size();i++){
      System.out.println(list.get(i)+" ");
    }

    //PERFORM SORTING USING COLLCTIONS PACKAGE
    System.out.println("The sorted order of list is:");
    Collections.sort(list);
    System.out.println(list);
}
}