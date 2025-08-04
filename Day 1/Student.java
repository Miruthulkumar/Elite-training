public class Student { //user defined class
    String name ; //variable creation
    int age ; 
    String branch ; 
    void display(){
        System.out.println("Name: " +  name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
    }
}

class Main{ //main function creation
public static void main (String[] args){
    Student s1 = new Student(); //Object creation
    s1.name = "Miruthul";
    s1.age = 19;
    s1.branch = "ECE";
    s1.display();
}
}
