public class Singinheri1 {
    String name = "Miruthul";
    int age = 20;
    void display(){
        System.out.print(name+" "+age);
    }
}


class Child extends Singinheri1{
    int balance = 10;
    String clg = "mkce";
    void show(){
        System.out.println("My clg name is : "+clg);
    }
}

class Main{
public static void main(String[] args){
    Child abc = new Child();
    abc.show();
    abc.display();
}
}