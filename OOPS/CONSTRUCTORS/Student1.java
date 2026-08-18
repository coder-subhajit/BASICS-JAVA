public class Student1 {
    String name;
    int age;

    public Student1(String n,int a){
        name=n;
        age =a;
    }

    public Student1(Student1 s){
    name=s.name;
    age=s.age;
    }
    void display(){
        System.out.println(name+" "+age);
    }
    public static void main(String[] args) {
        Student1 s1=new Student1("Xubha",20);
        Student1 s2=new Student1(s1);
        s2.display();
    }
    }
    
     

