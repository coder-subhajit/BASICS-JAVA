class Student{
    String name;
    int roll_no;
    int age;
    float marks;

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Roll No:"+roll_no);
        System.out.println("Age:"+age);
        System.out.println("Marks:"+marks);
        System.out.println();
    }
}
public class Day_3 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();

        s1.name="Neha";
        s1.roll_no=5;
        s1.age=20;
        s1.marks=99;
             
        s2.name="Subha";
        s2.roll_no=55;
        s2.age=25;
        s2.marks=9;
     
        s1.display();
        s2.display();
    }

}
