//final method
public class Animal {
   final void sound(){
    System.out.println("Animal makes sound...");
   } 
}
public class Dog extends Animal{
   void sound(){
//cannot override
   }
}
