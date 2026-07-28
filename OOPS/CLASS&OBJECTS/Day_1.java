class Student{
    //instance variable
    String name;
    int roll_no;
    int age;

     //method
    void display(){
    System.out.println("Name:"+name);
    System.out.println("Roll No:"+roll_no);
    System.out.println("Age:"+age);
    }
}

class Day_1{
    public static void main(String[] args) {
        //creating an object
       Student obj=new Student();
       //assigning value
       obj.name="Subha";
       obj.roll_no=1234;
       obj.age=99;
       //Calling method
       obj.display();
    }
}