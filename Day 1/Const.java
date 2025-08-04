class Student{
    String name;
    int age;
    String branch;
    void disp(){
        System.out.println(name + " " +  branch + " " + age);
    }

Student(){
    name = "Miruthul";
    age = 19;
    branch = "ECE";

}
}

public class Const{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.disp();
    }
}