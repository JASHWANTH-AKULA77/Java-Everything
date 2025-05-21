public class oopemployee {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();

        System.out.println(e2.empid);
        e1.name="Jash";
        e2.name="vam";
        e1.salary=67900986;

        e1.eating();
        e1.work();

    }
}
class Employee{
    int empid;
    String name;
    int salary;
    void work(){
        System.out.println("Working");

    }
    void eating(){
        System.out.println("Eating");
    }

}
