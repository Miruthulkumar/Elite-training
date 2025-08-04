public class Employee {
    String name;
    int age;
    int emp_number;
    String role;
    int salary;
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Employee Number : " + emp_number);
        System.out.println("Role : " + role);
        System.out.println("salary : " + salary);
        
    }
}

class Main{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.name = "Miruthul";
        e1.age = 19;
        e1.emp_number = 133;
        e1.role = "Software Engineer";
        e1.salary = 75000;
        e1.display();
    }
}
