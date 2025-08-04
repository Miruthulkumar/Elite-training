class Student{
    private String name;
    private int age;
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
}
public class Encapsu{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setname("Miruthul");
        s1.setage(19);
        System.out.println(s1.getname()+ " " + s1.getage());
    }
}