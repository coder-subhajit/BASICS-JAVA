class Student{
    String name;//instance variable
    int age;
}
 class Access_Intance_Variable_Using_Object {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Subhashree Sahu";
        s1.age=20;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
