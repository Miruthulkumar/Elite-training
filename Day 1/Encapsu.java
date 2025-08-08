class Student{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class Encapsu{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("Miruthul");
        s1.setAge(19);
        System.out.println(s1.getName()+ " " + s1.getAge());
    }
}