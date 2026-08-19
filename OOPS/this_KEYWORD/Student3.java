//this can be passed an argument

public class Student3 {
    void display(Student3 s){
        System.out.println("Student object is created");
    }
    void show(){
        display(this);
    }
    public static void main(String[] args) {
        Student3 s=new Student3();
        s.show();
    }
}
