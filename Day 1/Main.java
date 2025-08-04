class Student {
    String name ;
    int age ; 
    String branch ; 
    void display(){
        System.out.println("Name: " +  name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
    }
}

public class Main{

public static void main (String[] args){
    Student s1 = new Student();
    s1.name = "Miruthul";
    s1.age = 19;
    s1.branch = "ECE";
    s1.display();
}
}