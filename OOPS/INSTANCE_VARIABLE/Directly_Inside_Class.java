class Student{
    String name;//instance variable
    int age;
   void display(){
    System.out.println(name);
    System.out.println(age);
   }
}
 class Directly_Inside_Class {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Neha";
        s1.age=21;
        s1.display();
    }
    
}
