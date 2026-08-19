//this can call another constructor

public class Student2 {
    String name;
    int age;

    Student2() {
    this("Unknown",0);
    }

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Student2 s=new Student2();
        System.out.println("Name:"+s.name);
        System.out.println("Age:"+s.age);
    }
    
}
