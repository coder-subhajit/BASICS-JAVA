//this can return the current object

public class Student4 {
    Student4 getStudent(){
        return this;
    }
    public static void main(String[] args) {
        Student4 s1=new Student4();
        Student4 s2=s1.getStudent();
        System.out.println(s1==s2);
    }
}
