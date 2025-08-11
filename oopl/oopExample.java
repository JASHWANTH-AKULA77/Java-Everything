class Student{
int rollno;
String name;
int marks;
void study(){
System.out.println("Studying");

}
void practice(){
    System.out.println("Practicing");
}
void playing(){
    System.out.println("Student is playing");

}
void eat(){
    System.out.println("Student will eat if they get hungry");
}
    }
    public class oopExample {
    public static void main(String[] args) {
        student s1= new student();
        s1.rollno=7;
        s1.name="Jashwanth";
        s1.marks=100;
        
        System.out.println(s1.rollno);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        s1.study();
        s1.practice();
        s1.eat();
    }
    }
//oops Example
