class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name + " " + age);
    }
}

public class Parameconst {
    public static void main(String[] args) {
        
        Student s1 = new Student("Miruthul",19);
        Student s2 = new Student("Harshan",26);

        s1.display();
        s2.display();
    }
}
