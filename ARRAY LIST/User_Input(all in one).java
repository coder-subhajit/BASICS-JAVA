import java.util.*;
public class User_Input {
    public static void main(String[] args) {
      ArrayList<Integer>list=new ArrayList<>();
      System.out.println(list);//print nothing this is empty list

      //ADD ELEMENTS  
      list.add(0);
      list.add(1);
      list.add(2);
      list.add(5);
      System.out.println(list);  

      //ADD ELEMENTS IN SPECIFIC INDEX AND DESIRE VALUE
      list.add(1,4);
      System.out.println(list); 

    //GET ELEMENTS BY INDEX
    int element=list.get(0);
    System.out.println(element);
      element=list.get(3);
      System.out.println(element);//output comes from the updated list

      //CHECKING ELEMENTS IS PRESENT IN THE LIST
      System.out.println(list.contains(5));
   
    //MODIFY OR CHANGE THE VALUE OF LIST OR UPDATE AN ELEMENTS
    list.set(0,9);
    System.out.println(list);

    //DELETE OR REMOVE ELEMENT BY INDEX FROM LIST
    list.remove(0);
    list.remove(2);
    System.out.println(list);

    //REMOVE BY VALUE
    list.remove(Integer.valueOf(4));

    //FIND THE SIZE OF THE LIST
    int size=list.size();
    System.out.println("The size of the list is:"+size);
     
    //USE LOOPS
    System.out.println("The element of the list is(use normal loop):");
    for(int i=0;i<list.size();i++){
      System.out.println(list.get(i)+" ");
    }
    //USE FOR EACH LOOPS
     System.out.println("The element of the list is(using for each loop):");
    for(int num : list){
      System.out.println(num);

    }

    //PERFORM SORTING USING COLLCTIONS PACKAGE
    System.out.println("The sorted order of list is(Increasing Order):");
    Collections.sort(list);
    System.out.println(list);
    
    System.out.println("The sorted order of list is(Decreasing Order):");
    Collections.sort(list,Collections.reverseOrder());
    System.out.println(list);


    //CLEAR THE ENTIRE LIST
    list.clear();
    System.out.println(list);

    //CHECKS IF THE LIST CONTAINS ZERO ELEMENT
    System.out.println(list.isEmpty());
}
}
