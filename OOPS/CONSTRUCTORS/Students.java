public class Students {
    String name;
    int age;
    float marks;

    //constructors
    public Students(String n,int a,float m){
        name=n;
        age=a;
        marks=m;
    }
    //method
    void display(){
        System.out.println(name+" "+age+" "+marks);
    }
    public static void main(String[] args) {
        Students s1=new Students("Koel",20,25.0f);
        Students s2=new Students("Kriti",23,90.0f);
        s1.display();
        s2.display();
    }
}
