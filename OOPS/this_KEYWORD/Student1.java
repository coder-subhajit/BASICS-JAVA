//this can call the current object's method

public class Student1 {
    void display(){
        System.out.println("Hello");
    }
    void show(){
        this.display();
    }
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.show();
    }
}
