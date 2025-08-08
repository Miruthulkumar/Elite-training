abstract class A{
    int a = 10;
    int b = 10;
    void add(){
        System.out.println(a+b);
    }    
    void show(){};
}

class B extends A{
    public void show(){
        System.out.println("Abstraction is achieved!");
    }
}

public class Abstractionusingabstractclass {
    public static void main(String[] args){
        B obj = new B();
        obj.add();
        obj.show();
    }
}
